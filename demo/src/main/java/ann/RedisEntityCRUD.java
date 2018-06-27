package ann;

import ann.keyann.Invalid;
import ann.keyann.Key;
import ann.util.FieldsUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/19 16:27
 */
public class RedisEntityCRUD<RO extends RedisRo>  extends RedisEntityCrudImpl  {

    private Class<RO> entityClass;

    private String keyPrefix;

    private Map<String,Object> invalidMaps = new HashMap<>();

    private RO instance;

    public void save(RO ro){
        //获取子类实例
        Map<String,Object> map = FieldsUtil.getBeanFieldsValues(ro,invalidMaps);
        System.out.println(map);
        super.save(keyPrefix,"null");
    }

    public <RO extends RedisRo> RO getRoByKey(String keyPrefix) {
        super.getByKey(keyPrefix);
        return null;
    }

    public RedisEntityCRUD() {
        super();
        /** getClass().getGenericSuperclass()返回表示此 Class 所表示的实体（类、接口、基本类型或 void）
         *  的直接超类的 Type(Class<T>泛型中的类型)，然后将其转换ParameterizedType。。
         *  getActualTypeArguments()返回表示此类型实际类型参数的 Type 对象的数组。
         *  [0]就是这个数组中第一个了。。
         *  简而言之就是获得超类的泛型参数的实际类型。。*/
        entityClass = (Class<RO>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

        //类ro基础注解
        Key ro = entityClass.getAnnotation(Key.class);
        boolean isExistRo = (ro == null ? false : true);
        if (isExistRo) {
            keyPrefix = ro.key().intern();
        } else {
            //keyPrefix.append(entityClass.getCanonicalName());
            throw new RuntimeException("not find Key annotation");
        }
        //获取当前对象的实例
        instance = this.instance();
        if (entityClass != null) {
            /**返回类中所有字段，包括公共、保护、默认（包）访问和私有字段，但不包括继承的字段
             * entity.getFields();只返回对象所表示的类或接口的所有可访问公共字段
             * 在class中getDeclared**()方法返回的都是所有访问权限的字段、方法等；
             * 可看API
             * */
            Field[] fields = entityClass.getDeclaredFields();
            if (fields != null && fields.length > 0) {
                for (Field field : fields) {
                    if (!Modifier.isFinal(field.getModifiers())) {
                        field.setAccessible(true);//修改访问权限
                        Invalid invalid = field.getAnnotation(Invalid.class);
                        if(null != invalid) {
                            //不转换的字段
                            invalidMaps.put(field.getName(),invalid);
                        }
                    }
                }
            }
        }
    }

    private RO instance() {
        try {
            entityClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}

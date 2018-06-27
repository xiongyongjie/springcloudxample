package ann.util;

import ann.RedisRo;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/19 19:41
 */
public class FieldsUtil {

    public static Map<String,Object> getBeanFieldsValues(RedisRo ro,Map<String,Object> map){
        Map<String,Object> values = new HashMap<>();
        for(Field fd: ro.getClass().getDeclaredFields()){
            fd.setAccessible(true);
            try {
                if(map.get(fd.getName())==null) {
                    values.put(fd.getName(), fd.get(ro));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return values;
    }
}

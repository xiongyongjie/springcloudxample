package ann.keyann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Random;

/**
 * @Description: 存储的ky
 * @Author: 熊永杰
 * @CreateDate: 2018/6/19 17:04
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Key {
    /**
     * redis 存储的key
     * @return
     */
     String key() ;

    /**
     * 存储的前缀
     * @return
     */
     String prefix() default "DEFAULT";

    /**
     * 指定某个字段的值为key
     * @return
     */
     String fieldKey() default "";
}

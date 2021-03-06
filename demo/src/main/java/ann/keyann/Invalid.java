package ann.keyann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 注解为此 则无效字段不会加入redis存储为key
 * @Author: 熊永杰
 * @CreateDate: 2018/6/19 17:42
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Invalid {
    boolean value() default false;
}


package cn.edu.zju.acm.mvc.control.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Result {

    String name();

    String value();
    
    ResultType type();
    
    Header[] headers() default {};
}

package tobyspring.config;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * User : Soo Jung Choi (crystal2840@neowiz.com)
 * Date : 2023.03.27
 * Time : 3:19 PM
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(MyOnclassCondition.class)
public @interface ConditionalMyOnClass {
    String value();
}

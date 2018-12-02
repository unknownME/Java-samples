package annotations;

import java.lang.annotation.*;

@Documented
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CalcAnnotations {

    int number1();
    int number2();




}

package com.epam.lab;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@Documented

public @interface MyAnnotation {

    public String name() default "";

}


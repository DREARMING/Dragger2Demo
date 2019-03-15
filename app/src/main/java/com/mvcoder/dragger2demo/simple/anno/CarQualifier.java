package com.mvcoder.dragger2demo.simple.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface CarQualifier {
    String value() default "";
}

package com.happy3w.javaclassworker.classfile.attribute.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationTargetDefine {
    byte type();
    int constantType() default -1;
}

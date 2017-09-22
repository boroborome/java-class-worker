package com.happy3w.javaclassworker.classfile.attribute.target;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(AnnotationTargetDefines.class)
public @interface AnnotationTargetDefine {
    byte type();
    int constantType() default -1;
}

package com.happy3w.javaclassworker.classfile.attribute.target;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationTargetDefines {
    AnnotationTargetDefine[] value();
}

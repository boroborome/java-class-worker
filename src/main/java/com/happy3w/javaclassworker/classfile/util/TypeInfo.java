package com.happy3w.javaclassworker.classfile.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.lang.annotation.Annotation;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TypeInfo <AT extends Annotation, T>{
    private AT define;
    private Class<? extends T> type;

    public TypeInfo(Class<AT> annotationType, Class<? extends T> type) {
        this.type = type;
        define = type.getAnnotation(annotationType);
    }
}

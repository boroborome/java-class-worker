package com.happy3w.javaclassworker.classfile.attribute.elementvalue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ElementValueTypeInfo {
    private ElementValueDefine define;
    private Class<? extends AbstractRuntimeAnnotationElementValue> type;

    public static ElementValueTypeInfo from(Class<? extends AbstractRuntimeAnnotationElementValue> type) {
        ElementValueDefine define = type.getAnnotation(ElementValueDefine.class);
        return new ElementValueTypeInfo(define, type);
    }
}

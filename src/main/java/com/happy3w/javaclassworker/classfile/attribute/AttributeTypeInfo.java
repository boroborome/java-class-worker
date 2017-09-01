package com.happy3w.javaclassworker.classfile.attribute;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AttributeTypeInfo {
    private AttributeDefine define;
    private Class<? extends AbstractAttribute> type;

    public static AttributeTypeInfo from(Class<? extends AbstractAttribute> type) {
        AttributeDefine define = type.getAnnotation(AttributeDefine.class);
        return new AttributeTypeInfo(define, type);
    }
}

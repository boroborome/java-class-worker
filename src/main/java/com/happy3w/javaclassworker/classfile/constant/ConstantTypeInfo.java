package com.happy3w.javaclassworker.classfile.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ConstantTypeInfo {
    private ConstantDefine define;
    private Class<? extends AbstractConstant> type;

    public static ConstantTypeInfo from(Class<? extends AbstractConstant> type) {
        ConstantDefine define = type.getAnnotation(ConstantDefine.class);
        return new ConstantTypeInfo(define, type);
    }
}

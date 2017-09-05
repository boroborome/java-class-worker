package com.happy3w.javaclassworker.classfile.constant;

import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code = ConstantUtf8.Code, name = "Utf8")
@Getter
@Setter
public class ConstantUtf8 extends AbstractConstant{
    public static final int Code = 1;

    private byte[] values;
}

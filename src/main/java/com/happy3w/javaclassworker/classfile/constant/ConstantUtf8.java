package com.happy3w.javaclassworker.classfile.constant;

import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code=1, name = "Utf8")
@Getter
@Setter
public class ConstantUtf8 extends AbstractConstant{
    private byte[] values;
}

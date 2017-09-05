package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code = ConstantInteger.Code, name = "Integer")
@Getter
@Setter
public class ConstantInteger extends AbstractConstant{
    public static final int Code = 3;

    @Size(4)
    private int value;
}

package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code = ConstantMethodType.Code, name = "MethodType")
@Getter
@Setter
public class ConstantMethodType extends AbstractConstant{
    public static final int Code = 16;

    @Size(2)
    private int descriptorIndex;
}

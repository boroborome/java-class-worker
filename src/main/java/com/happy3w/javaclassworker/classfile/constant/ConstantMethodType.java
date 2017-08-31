package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code=16, name = "MethodType")
@Getter
@Setter
public class ConstantMethodType extends AbstractConstant{
    @Size(2)
    private int descriptorIndex;
}

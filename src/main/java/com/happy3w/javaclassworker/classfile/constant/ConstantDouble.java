package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code = ConstantDouble.Code, name = "Double")
@Getter
@Setter
public class ConstantDouble extends AbstractConstant{
    public static final int Code = 6;
    @Size(8)
    private double value;
}

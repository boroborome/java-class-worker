package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code=6, name = "Double")
@Getter
@Setter
public class ConstantDouble extends AbstractConstant{
    @Size(8)
    private double value;
}

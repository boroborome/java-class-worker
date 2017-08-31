package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code=3, name = "Integer")
@Getter
@Setter
public class ConstantInteger extends AbstractConstant{

    @Size(4)
    private int value;
}

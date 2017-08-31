package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code=8, name = "String")
@Getter
@Setter
public class ConstantString extends AbstractConstant{

    @Size(2)
    private int stringIndex;
}

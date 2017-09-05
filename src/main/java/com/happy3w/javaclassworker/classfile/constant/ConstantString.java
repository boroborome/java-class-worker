package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code = ConstantString.Code, name = "String")
@Getter
@Setter
public class ConstantString extends AbstractConstant{
    public static final int Code = 8;

    @Size(2)
    private int stringIndex;
}

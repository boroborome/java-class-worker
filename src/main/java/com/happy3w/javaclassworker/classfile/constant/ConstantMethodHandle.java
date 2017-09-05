package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code = ConstantMethodHandle.Code, name = "MethodHandle")
@Getter
@Setter
public class ConstantMethodHandle extends AbstractConstant{
    public static final int Code = 15;

    @Size(1)
    private int referenceKind;

    @Size(2)
    private int referenceIndex;
}

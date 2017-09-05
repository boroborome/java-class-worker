package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code = ConstantInvokeDynamic.Code, name = "InvokeDynamic")
@Getter
@Setter
public class ConstantInvokeDynamic extends AbstractConstant{
    public static final int Code = 18;

    @Size(2)
    private int bootstrapMethodAttrIndex;
    @Size(2)
    private int nameAndTypeIndex;
}

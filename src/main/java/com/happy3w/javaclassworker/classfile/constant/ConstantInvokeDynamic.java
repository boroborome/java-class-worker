package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code=18, name = "InvokeDynamic")
@Getter
@Setter
public class ConstantInvokeDynamic extends AbstractConstant{
    @Size(2)
    private int bootstrapMethodAttrIndex;
    @Size(2)
    private int nameAndTypeIndex;
}

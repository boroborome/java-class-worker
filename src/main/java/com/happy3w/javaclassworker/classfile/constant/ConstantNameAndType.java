package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code = ConstantNameAndType.Code, name = "NameAndType")
@Getter
@Setter
public class ConstantNameAndType extends AbstractConstant{
    public static final int Code = 12;

    @Size(2)
    private int nameIndex;

    @Size(2)
    private int descriptorIndex;
}

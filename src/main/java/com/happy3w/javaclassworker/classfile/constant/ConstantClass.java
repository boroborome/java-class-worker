package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code=7, name = "Class")
@Getter
@Setter
public class ConstantClass extends AbstractConstant{
    @Size(2)
    private int nameIndex; // CONSTANT_Utf8_info
}

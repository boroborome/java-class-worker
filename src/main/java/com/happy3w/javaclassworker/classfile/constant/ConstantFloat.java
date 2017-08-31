package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code=4, name = "Float")
@Getter
@Setter
public class ConstantFloat extends AbstractConstant{

    @Size(4)
    private float value;
}

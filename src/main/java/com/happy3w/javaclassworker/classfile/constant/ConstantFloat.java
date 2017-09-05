package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code = ConstantFloat.Code, name = "Float")
@Getter
@Setter
public class ConstantFloat extends AbstractConstant{
    public static final int Code = 4;

    @Size(4)
    private float value;
}

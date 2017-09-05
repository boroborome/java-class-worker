package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code = ConstantLong.Code, name = "Long")
@Getter
@Setter
public class ConstantLong extends AbstractConstant{
    public static final int Code = 5;

    @Size(8)
    private long value;
}

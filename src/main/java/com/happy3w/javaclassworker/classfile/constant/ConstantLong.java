package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@ConstantDefine(code=5, name = "Long")
@Getter
@Setter
public class ConstantLong extends AbstractConstant{
    @Size(8)
    private long value;
}

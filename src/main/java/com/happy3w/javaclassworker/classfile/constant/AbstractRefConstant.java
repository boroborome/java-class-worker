package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractRefConstant extends AbstractConstant{
    @Size(2)
    private int classIndex;
    @Size(2)
    private int nameAndTypeIndex;
}

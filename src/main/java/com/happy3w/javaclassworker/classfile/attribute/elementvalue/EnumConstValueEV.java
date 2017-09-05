package com.happy3w.javaclassworker.classfile.attribute.elementvalue;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ElementValueDefine(tag = 'e', type = "Enum")
public class EnumConstValueEV extends ConstValueEV {
    @Size(2)
    private int typeNameIndex;

    @Size(2)
    private int constNameIndex;
}

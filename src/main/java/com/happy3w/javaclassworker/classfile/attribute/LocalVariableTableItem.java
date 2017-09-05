package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalVariableTableItem {
    @Size(2)
    private int startPC;
    @Size(2)
    private int length;
    @Size(2)
    private int nameIndex;
    @Size(2)
    private int descriptorIndex;
    @Size(2)
    private int index;
}

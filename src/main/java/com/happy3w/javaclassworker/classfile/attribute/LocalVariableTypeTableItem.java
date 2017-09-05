package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalVariableTypeTableItem {
    @Size(2)
    private int startPC;
    @Size(2)
    private int length;
    @Size(2)
    private int nameIndex;
    @Size(2)
    private int signatureIndex;
    @Size(2)
    private int index;
}

package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractAttribute {
    @Size(2)
    private int attributeNameIndex; // CONSTANT_Utf8_info

//    u4 attribute_length;

    @Size(4)
    private int attributeLength;
}

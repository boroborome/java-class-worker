package com.happy3w.javaclassworker.classfile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AtrributeInfo {
    @Size(2)
    private int attributeNameIndex; // CONSTANT_Utf8_info

//    u4 attribute_length;
//    u1 info[attribute_length];
    private byte[] info;
}

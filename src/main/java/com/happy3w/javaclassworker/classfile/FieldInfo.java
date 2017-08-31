package com.happy3w.javaclassworker.classfile;

import lombok.Getter;
import lombok.Setter;

import java.util.EnumSet;
import java.util.List;

@Getter
@Setter
public class FieldInfo {
    @Size(2)
    private EnumSet<AccessFlag> accessFlags;

    @Size(2)
    private int nameIndex;

    @Size(2)
    private int descriptorIndex;

    private List<AtrributeInfo> atrributes;
}

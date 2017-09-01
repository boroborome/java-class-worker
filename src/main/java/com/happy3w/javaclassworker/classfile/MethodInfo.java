package com.happy3w.javaclassworker.classfile;

import com.happy3w.javaclassworker.classfile.attribute.AbstractAttribute;
import lombok.Getter;
import lombok.Setter;

import java.util.EnumSet;
import java.util.List;

@Getter
@Setter
public class MethodInfo {
    @Size(2)
    private EnumSet<AccessFlag> accessFlags;

    @Size(2)
    private int nameIndex;

    @Size(2)
    private int descriptorIndex;

    private List<AbstractAttribute> atrributes;
}

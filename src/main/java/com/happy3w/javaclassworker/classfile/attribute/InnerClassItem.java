package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.AccessFlag;
import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.EnumSet;

@Getter
@Setter
public class InnerClassItem {
    @Size(2)
    private int innerClassInfoIndex;
    @Size(2)
    private int outerClassInfoIndex;
    @Size(2)
    private int innerNameIndex;
    @Size(2)
    private EnumSet<AccessFlag> innerClassAccessFlag;
}

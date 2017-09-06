package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.Size;

public class RuntimeAnnotationTypePathItem {
    @Size(1)
    private int typePathKind;
    @Size(1)
    private int typeArgumentIndex;
}

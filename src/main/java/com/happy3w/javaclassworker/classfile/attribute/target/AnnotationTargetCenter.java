package com.happy3w.javaclassworker.classfile.attribute.target;

import com.happy3w.javaclassworker.classfile.util.ValueCenter;

public class AnnotationTargetCenter extends ValueCenter<AnnotationTargetDefine, AbstractTarget, Byte>{

    public AnnotationTargetCenter() {
        super(i->i.getDefine().type());
    }
}

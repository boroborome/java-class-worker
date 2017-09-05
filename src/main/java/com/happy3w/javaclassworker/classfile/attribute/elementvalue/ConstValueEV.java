package com.happy3w.javaclassworker.classfile.attribute.elementvalue;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ConstValueEV extends AbstractRuntimeAnnotationElementValue {
    @Size(2)
    private int constValueIndex;
}

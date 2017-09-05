package com.happy3w.javaclassworker.classfile.attribute.elementvalue;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractRuntimeAnnotationElementValue {

    @Size(1)
    private byte tag;
}

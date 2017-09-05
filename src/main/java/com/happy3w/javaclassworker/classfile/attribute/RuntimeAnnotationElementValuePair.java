package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.Size;
import com.happy3w.javaclassworker.classfile.attribute.elementvalue.AbstractRuntimeAnnotationElementValue;

public class RuntimeAnnotationElementValuePair {
    @Size(2)
    private int elementNameIndex;

    private AbstractRuntimeAnnotationElementValue value;
}

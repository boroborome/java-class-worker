package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.Size;

import java.util.List;

public class RuntimeAnnotationItem {
    @Size(2)
    private int typeIndex;
    private List<RuntimeAnnotationElementValuePair> elementValuePairs;
}

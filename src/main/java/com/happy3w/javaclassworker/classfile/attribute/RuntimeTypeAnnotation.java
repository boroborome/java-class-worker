package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RuntimeTypeAnnotation {
    private List<RuntimeAnnotationTypePathItem> typePath;
    @Size(2)
    private int typeIndex;
    private List<RuntimeAnnotationElementValuePair> elementValuePairs;
}

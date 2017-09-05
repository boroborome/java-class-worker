package com.happy3w.javaclassworker.classfile.attribute.elementvalue;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@ElementValueDefine(tag = '[', type = "Array")
public class ArrayEV extends ConstValueEV {
    private List<AbstractRuntimeAnnotationElementValue> values;
}

package com.happy3w.javaclassworker.classfile.attribute.elementvalue;

import com.happy3w.javaclassworker.classfile.attribute.RuntimeVisibleAnnotationsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ElementValueDefine(tag = '@', type = "Annotation")
public class AnnotationEV extends ConstValueEV {
    private RuntimeVisibleAnnotationsAttribute annotation;
}

package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AttributeDefine(code = "RuntimeVisibleParameterAnnotations", location = {EnumLocation.MethodInfo}, version = "49.0")
@Getter
@Setter
public class RuntimeVisibleParameterAnnotationsAttribute extends AbstractAttribute {
    private List<List<RuntimeAnnotationItem>> parameterAnnotations;
}

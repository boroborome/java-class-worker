package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AttributeDefine(code = "RuntimeInvisibleParameterAnnotations", location = {EnumLocation.MethodInfo}, version = "49.0")
@Getter
@Setter
public class RuntimeInvisibleParameterAnnotationsAttribute extends AbstractAttribute {
    private List<List<RuntimeAnnotationItem>> parameterAnnotations;
}

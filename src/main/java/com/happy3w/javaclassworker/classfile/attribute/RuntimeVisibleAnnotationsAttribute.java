package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AttributeDefine(code = "RuntimeVisibleAnnotations", location = {EnumLocation.ClassFile, EnumLocation.FieldInfo,
        EnumLocation.MethodInfo}, version = "49.0")
@Getter
@Setter
public class RuntimeVisibleAnnotationsAttribute extends AbstractAttribute {
    private List<RuntimeAnnotationItem> annotations;
}

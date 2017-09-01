package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;

@AttributeDefine(code = "RuntimeVisibleTypeAnnotations", location = {EnumLocation.ClassFile, EnumLocation.FieldInfo,
        EnumLocation.MethodInfo, EnumLocation.Code}, version = "52.0")
public class RuntimeVisibleTypeAnnotationsAttribute extends AbstractAttribute {
}

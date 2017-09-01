package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;

@AttributeDefine(code = "RuntimeVisibleAnnotations", location = {EnumLocation.ClassFile, EnumLocation.FieldInfo,
        EnumLocation.MethodInfo}, version = "49.0")
public class RuntimeVisibleAnnotationsAttribute extends AbstractAttribute {
}

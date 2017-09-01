package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;

@AttributeDefine(code = "Synthetic", location = {EnumLocation.ClassFile, EnumLocation.FieldInfo,
        EnumLocation.MethodInfo}, version = "45.3")
public class SyntheticAttribute extends AbstractAttribute {
}

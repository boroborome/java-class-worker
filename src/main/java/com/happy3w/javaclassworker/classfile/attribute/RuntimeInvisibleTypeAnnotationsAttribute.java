package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "RuntimeInvisibleTypeAnnotations", location = {EnumLocation.ClassFile, EnumLocation.FieldInfo,
        EnumLocation.MethodInfo, EnumLocation.Code}, version = "52.0")
@Getter
@Setter
public class RuntimeInvisibleTypeAnnotationsAttribute extends AbstractAttribute {
}

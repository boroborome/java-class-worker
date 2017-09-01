package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "MethodParameters", location = {EnumLocation.MethodInfo}, version = "52.0")
@Getter
@Setter
public class MethodParametersAttribute extends AbstractAttribute {
}

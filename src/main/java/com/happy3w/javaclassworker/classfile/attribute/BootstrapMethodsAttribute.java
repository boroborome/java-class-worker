package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "BootstrapMethods", location = {EnumLocation.ClassFile}, version = "51.0")
@Getter
@Setter
public class BootstrapMethodsAttribute extends AbstractAttribute {
}

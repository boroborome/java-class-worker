package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "EnclosingMethod", location = {EnumLocation.ClassFile}, version = "49.0")
@Getter
@Setter
public class EnclosingMethodAttribute extends AbstractAttribute {
}

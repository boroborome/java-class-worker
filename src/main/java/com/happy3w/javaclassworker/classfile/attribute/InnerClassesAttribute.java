package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "InnerClasses", location = {EnumLocation.ClassFile}, version = "45.3")
@Getter
@Setter
public class InnerClassesAttribute extends AbstractAttribute {
}

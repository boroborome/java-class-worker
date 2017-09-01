package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "LineNumberTable", location = {EnumLocation.Code}, version = "45.3")
@Getter
@Setter
public class LineNumberTableAttribute extends AbstractAttribute {
}

package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "LocalVariableTypeTable", location = {EnumLocation.Code}, version = "49.0")
@Getter
@Setter
public class LocalVariableTypeTableAttribute extends AbstractAttribute {
}

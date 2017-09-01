package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "ConstantValue", location = {EnumLocation.FieldInfo}, version = "45.3")
@Getter
@Setter
public class ConstantValueAttribute extends AbstractAttribute {
    @Size(2)
    private int constantValueIndex;
}

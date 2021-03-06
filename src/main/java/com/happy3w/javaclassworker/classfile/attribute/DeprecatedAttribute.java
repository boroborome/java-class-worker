package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "Deprecated", location = {EnumLocation.ClassFile, EnumLocation.FieldInfo,
        EnumLocation.MethodInfo}, version = "45.3")
@Getter
@Setter
public class DeprecatedAttribute extends AbstractAttribute {
    public DeprecatedAttribute() {
        this.setAttributeLength(0);
    }
}

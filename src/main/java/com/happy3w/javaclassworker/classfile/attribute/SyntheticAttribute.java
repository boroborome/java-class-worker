package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "Synthetic", location = {EnumLocation.ClassFile, EnumLocation.FieldInfo,
        EnumLocation.MethodInfo}, version = "45.3")
@Getter
@Setter
public class SyntheticAttribute extends AbstractAttribute {
    public SyntheticAttribute() {
        this.setAttributeLength(0);
    }
}

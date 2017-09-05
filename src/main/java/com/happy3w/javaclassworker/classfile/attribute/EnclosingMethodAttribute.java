package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "EnclosingMethod", location = {EnumLocation.ClassFile}, version = "49.0")
@Getter
@Setter
public class EnclosingMethodAttribute extends AbstractAttribute {
    @Size(2)
    private int classIndex;
    @Size(2)
    private int methodIndex;
}

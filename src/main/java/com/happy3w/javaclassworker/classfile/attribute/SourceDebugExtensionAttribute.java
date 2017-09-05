package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

@AttributeDefine(code = "SourceDebugExtension", location = {EnumLocation.ClassFile}, version = "49.0")
@Getter
@Setter
public class SourceDebugExtensionAttribute extends AbstractAttribute {
    private byte[] debugExtension;
}

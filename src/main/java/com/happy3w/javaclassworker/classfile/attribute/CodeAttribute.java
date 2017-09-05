package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AttributeDefine(code = "Code", location = {EnumLocation.MethodInfo}, version = "45.3")
@Getter
@Setter
public class CodeAttribute extends AbstractAttribute {
    @Size(2)
    private int maxStack;

    @Size(2)
    private int maxLocals;

    @Size(4)
    private int codeLength;

    private byte[] codes;

    private List<ExceptionTableItem> exceptionTable;

    private List<AbstractAttribute> attributes;
}

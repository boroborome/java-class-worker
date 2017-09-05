package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AttributeDefine(code = "Exceptions", location = {EnumLocation.MethodInfo}, version = "45.3")
@Getter
@Setter
public class ExceptionsAttribute extends AbstractAttribute {
    private List<Integer> exceptionIndexTable;
}

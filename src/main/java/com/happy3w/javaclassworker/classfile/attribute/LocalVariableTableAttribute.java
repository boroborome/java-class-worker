package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AttributeDefine(code = "LocalVariableTable", location = {EnumLocation.Code}, version = "45.3")
@Getter
@Setter
public class LocalVariableTableAttribute extends AbstractAttribute {
    private List<LocalVariableTableItem> localVariableTable;
}

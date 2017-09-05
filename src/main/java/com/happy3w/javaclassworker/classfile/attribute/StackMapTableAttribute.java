package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.EnumLocation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AttributeDefine(code = "StackMapTable", location = {EnumLocation.Code}, version = "50.0")
@Getter
@Setter
public class StackMapTableAttribute extends AbstractAttribute {
    private List<StackMapFrame> entiries;
}

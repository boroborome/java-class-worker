package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionTableItem {
    @Size(2)
    private int startPC;

    @Size(2)
    private int endPC;

    @Size(2)
    private int handlerPC;

    @Size(2)
    private int catchType; // CONSTANT_Class_info
}

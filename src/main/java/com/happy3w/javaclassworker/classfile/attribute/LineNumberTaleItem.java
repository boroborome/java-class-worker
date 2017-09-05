package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LineNumberTaleItem {
    @Size(2)
    private int startPC;

    @Size(2)
    private int lineNumber;
}

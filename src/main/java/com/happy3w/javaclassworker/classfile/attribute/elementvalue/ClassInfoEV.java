package com.happy3w.javaclassworker.classfile.attribute.elementvalue;

import com.happy3w.javaclassworker.classfile.Size;
import com.happy3w.javaclassworker.classfile.constant.ConstantUtf8;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ElementValueDefine(tag = 'c', type = "Class", constantType = ConstantUtf8.Code)
public class ClassInfoEV extends ConstValueEV {
    @Size(2)
    private int classInfoIndex;
}

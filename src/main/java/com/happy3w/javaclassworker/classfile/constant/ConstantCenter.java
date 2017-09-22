package com.happy3w.javaclassworker.classfile.constant;

import com.happy3w.javaclassworker.classfile.util.ValueCenter;
import org.springframework.stereotype.Component;

@Component
public class ConstantCenter extends ValueCenter<ConstantDefine, AbstractConstant, Integer> {

    public ConstantCenter() {
        super(i->i.getDefine().code());
    }
}
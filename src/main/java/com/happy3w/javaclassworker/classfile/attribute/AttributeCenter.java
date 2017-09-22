package com.happy3w.javaclassworker.classfile.attribute;

import com.happy3w.javaclassworker.classfile.util.ValueCenter;
import org.springframework.stereotype.Component;

@Component
public class AttributeCenter extends ValueCenter<AttributeDefine, AbstractAttribute, String> {

    public AttributeCenter() {
        super(i->i.getDefine().code());
    }
}
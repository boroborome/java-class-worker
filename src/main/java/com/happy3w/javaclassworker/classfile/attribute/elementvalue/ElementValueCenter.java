package com.happy3w.javaclassworker.classfile.attribute.elementvalue;

import com.happy3w.javaclassworker.classfile.util.ValueCenter;
import org.springframework.stereotype.Component;

@Component
public class ElementValueCenter extends ValueCenter<ElementValueDefine, AbstractRuntimeAnnotationElementValue, Byte>{

    public ElementValueCenter() {
        super(i->i.getDefine().tag());
    }
}

package com.happy3w.javaclassworker.classfile.attribute.elementvalue;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ElementValueCenter {
    private List<ElementValueTypeInfo> typeInfoList;
    private Map<Byte, ElementValueTypeInfo> typeInfoMap;

    public void init(List<ElementValueTypeInfo> constantTypeInfoList) {
        this.typeInfoList = constantTypeInfoList;
        this.typeInfoMap = constantTypeInfoList
                .stream()
                .collect(Collectors
                        .toMap(i->i.getDefine().tag(),
                                i->i,
                                (k1,k2)->k2));
    }
    public Optional<ElementValueTypeInfo> findOneByTag(String tag) {
        ElementValueTypeInfo info = typeInfoMap.get(tag);
        return info == null ? Optional.empty() : Optional.of(info);
    }
}

package com.happy3w.javaclassworker.classfile.attribute;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AttributeCenter {
    private List<AttributeTypeInfo> typeInfoList;
    private Map<String, AttributeTypeInfo> typeInfoMap;

    public void init(List<AttributeTypeInfo> constantTypeInfoList) {
        this.typeInfoList = constantTypeInfoList;
        this.typeInfoMap = constantTypeInfoList
                .stream()
                .collect(Collectors
                        .toMap(i->i.getDefine().code(),
                                i->i,
                                (k1,k2)->k2));
    }
    public Optional<AttributeTypeInfo> findOneByCode(String code) {
        AttributeTypeInfo info = typeInfoMap.get(code);
        return info == null ? Optional.empty() : Optional.of(info);
    }
}

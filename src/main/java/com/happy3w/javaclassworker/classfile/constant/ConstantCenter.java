package com.happy3w.javaclassworker.classfile.constant;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ConstantCenter {
    private List<ConstantTypeInfo> typeInfoList;
    private Map<Integer, ConstantTypeInfo> typeInfoMap;

    public void init(List<ConstantTypeInfo> constantTypeInfoList) {
        this.typeInfoList = constantTypeInfoList;
        this.typeInfoMap = constantTypeInfoList
                .stream()
                .collect(Collectors
                        .toMap(i->i.getDefine().code(),
                                i->i,
                                (k1,k2)->k2));
    }
    public Optional<ConstantTypeInfo> findOneByCode(int code) {
        ConstantTypeInfo info = typeInfoMap.get(code);
        return info == null ? Optional.empty() : Optional.of(info);
    }
}

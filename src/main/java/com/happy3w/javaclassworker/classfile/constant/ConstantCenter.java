package com.happy3w.javaclassworker.classfile.constant;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ConstantCenter {
    private List<ConstantTypeInfo> constantTypeInfoList;
    private Map<Integer, ConstantTypeInfo> constantTypeInfoMap;

    public void init(List<ConstantTypeInfo> constantTypeInfoList) {
        this.constantTypeInfoList = constantTypeInfoList;
        this.constantTypeInfoMap = constantTypeInfoList
                .stream()
                .collect(Collectors
                        .toMap(i->i.getDefine().code(),
                                i->i,
                                (k1,k2)->k2));
    }
    public Optional<ConstantTypeInfo> findOneByCode(int code) {
        ConstantTypeInfo info = constantTypeInfoMap.get(code);
        return info == null ? Optional.empty() : Optional.of(info);
    }
}

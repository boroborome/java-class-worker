package com.happy3w.javaclassworker.classfile.util;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValueCenter<AT extends Annotation, T, K> {
    private List<TypeInfo<AT, T>> typeInfoList;
    private Map<K, TypeInfo<AT, T>> typeInfoMap;
    private final Function<TypeInfo<AT, T>, K> keyFun;

    public ValueCenter(Function<TypeInfo<AT, T>, K> keyFun) {
        this.keyFun = keyFun;
    }

    public void init(List<TypeInfo<AT, T>> typeInfoList) {
        this.typeInfoList = typeInfoList;
        this.typeInfoMap = typeInfoList
                .stream()
                .collect(Collectors
                        .toMap(keyFun,
                                i->i,
                                (k1,k2)->k2));
    }
    public Optional<TypeInfo<AT, T>> findOneByKey(K key) {
        TypeInfo<AT, T> info = typeInfoMap.get(key);
        return info == null ? Optional.empty() : Optional.of(info);
    }
}

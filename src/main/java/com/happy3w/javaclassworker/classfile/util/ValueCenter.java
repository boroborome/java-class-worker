package com.happy3w.javaclassworker.classfile.util;

import lombok.extern.slf4j.Slf4j;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class ValueCenter<AnnotationType extends Annotation, ItemType, KeyType> {
    private List<TypeInfo<AnnotationType, ItemType>> typeInfoList;
    private Map<KeyType, TypeInfo<AnnotationType, ItemType>> typeInfoMap;
    private final Function<TypeInfo<AnnotationType, ItemType>, KeyType> keyFun;

    public ValueCenter(Function<TypeInfo<AnnotationType, ItemType>, KeyType> keyFun) {
        this.keyFun = keyFun;
    }

    public void init(List<TypeInfo<AnnotationType, ItemType>> typeInfoList) {
        this.typeInfoList = typeInfoList;
        this.typeInfoMap = typeInfoList
                .stream()
                .collect(Collectors
                        .toMap(keyFun,
                                i->i,
                                (k1,k2)->k2));
    }
    public Optional<TypeInfo<AnnotationType, ItemType>> findOneByKey(KeyType key) {
        TypeInfo<AnnotationType, ItemType> info = typeInfoMap.get(key);
        return info == null ? Optional.empty() : Optional.of(info);
    }

    public Class<AnnotationType> getAnnotationType() {
        Type type = getClass().getGenericSuperclass();
        while (type instanceof ParameterizedTypeImpl) {
            ParameterizedTypeImpl parameterType = (ParameterizedTypeImpl) type;
            if (parameterType.getRawType() == ValueCenter.class) {
                return (Class<AnnotationType>) parameterType.getActualTypeArguments()[0];
            }
            type = ((ParameterizedTypeImpl) type).getRawType().getGenericSuperclass();
        }
        return null;
    }
}

package com.happy3w.javaclassworker.classfile;


import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class ClassFile {

    @Size(4)
    private long magic;

    @Size(2)
    private int minorVersion;

    @Size(2)
    private int majorVersion;

    private List<ConstantPool> cpInfos = new ArrayList<>();

    @Size(2)
    private EnumSet<AccessFlag> accessFlags;

    @Size(2)
    private int thisClass;

    @Size(2)
    private int superClass;

    private List<Integer> interfaces = new ArrayList<>();

    private List<FieldInfo> fieldInfos = new ArrayList<>();

    private List<MethodInfo> methodInfos = new ArrayList<>();

    private List<AtrributeInfo> atrributeInfos = new ArrayList<>();

}

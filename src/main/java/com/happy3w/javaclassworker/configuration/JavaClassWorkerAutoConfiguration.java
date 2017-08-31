package com.happy3w.javaclassworker.configuration;

import com.happy3w.javaclassworker.classfile.constant.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.stream.Collectors;

@Configuration
public class JavaClassWorkerAutoConfiguration {

    // TOBE Improved with ConstantRegistrar
    @Bean
    public ConstantCenter constantCenter(ApplicationContext applicationContext) {
        ConstantCenter center = new ConstantCenter();
        center.init(Arrays.asList(ConstantClass.class,
                ConstantFieldref.class,
                ConstantMethodref.class,
                ConstantInterfaceMethodref.class,
                ConstantInteger.class,
                ConstantString.class,
                ConstantFloat.class,
                ConstantLong.class,
                ConstantDouble.class,
                ConstantNameAndType.class,
                ConstantUtf8.class,
                ConstantMethodHandle.class,
                ConstantMethodType.class,
                ConstantInvokeDynamic.class)
                .stream()
                .map(t -> ConstantTypeInfo.from(t))
                .collect(Collectors.toList())
        );
        return center;
    }
}

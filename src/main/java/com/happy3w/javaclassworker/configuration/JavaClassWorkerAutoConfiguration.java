package com.happy3w.javaclassworker.configuration;

import com.happy3w.javaclassworker.JavaClassWorkerApplication;
import com.happy3w.javaclassworker.classfile.constant.AbstractConstant;
import com.happy3w.javaclassworker.classfile.constant.ConstantCenter;
import com.happy3w.javaclassworker.classfile.constant.ConstantDefine;
import com.happy3w.javaclassworker.classfile.constant.ConstantTypeInfo;
import org.reflections.Reflections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Collectors;

@Configuration
public class JavaClassWorkerAutoConfiguration {

    @Bean
    public ConstantCenter constantCenter(ApplicationContext applicationContext) {
        Reflections reflections = new Reflections(JavaClassWorkerApplication.class.getPackage().getName());
        ConstantCenter center = new ConstantCenter();
        center.init(reflections.getTypesAnnotatedWith(ConstantDefine.class)
                .stream()
                .map(t -> ConstantTypeInfo.from((Class<? extends AbstractConstant>) t))
                .collect(Collectors.toList())
        );
        return center;
    }
}

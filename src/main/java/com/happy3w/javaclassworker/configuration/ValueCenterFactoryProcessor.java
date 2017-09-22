package com.happy3w.javaclassworker.configuration;

import com.happy3w.javaclassworker.JavaClassWorkerApplication;
import com.happy3w.javaclassworker.classfile.util.TypeInfo;
import com.happy3w.javaclassworker.classfile.util.ValueCenter;
import org.reflections.Reflections;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

import java.lang.annotation.Annotation;
import java.util.stream.Collectors;

public class ValueCenterFactoryProcessor implements BeanFactoryPostProcessor, Ordered {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Reflections reflections = new Reflections(JavaClassWorkerApplication.class.getPackage().getName());
        beanFactory.getBeansOfType(ValueCenter.class)
                .values()
                .stream()
                .forEach(vc -> {
                    final Class<? extends Annotation> annotationType = vc.getAnnotationType();
                    if (annotationType != null) {
                        vc.init(reflections.getTypesAnnotatedWith(annotationType)
                                .stream()
                                .map(t -> new TypeInfo(annotationType, t))
                                .collect(Collectors.toList()));
                    }
                });
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

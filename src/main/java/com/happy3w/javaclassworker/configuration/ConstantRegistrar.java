package com.happy3w.javaclassworker.configuration;

import com.happy3w.javaclassworker.classfile.constant.ConstantCenter;
import com.happy3w.javaclassworker.classfile.constant.ConstantDefine;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.util.ClassUtils;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.*;

public class ConstantRegistrar implements ResourceLoaderAware, BeanClassLoaderAware, ImportBeanDefinitionRegistrar {
    private ResourceLoader resourceLoader;
    private ClassLoader classLoader;

    @Autowired
    private ConstantCenter constantCenter;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        try {
//            ConstantCenter.class.getPackage().
            // ConstantCenter.class.getPackage().getName().replace('.', '/')
            String packages = "com/happy3w/javaclassworker/classfile/constant";
            Enumeration<URL> res = Thread.currentThread().getContextClassLoader().getResources(packages);
            while (res.hasMoreElements()) {
                System.out.println(res.nextElement());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ClassPathScanningCandidateComponentProvider scanner = getScanner();
        scanner.setResourceLoader(this.resourceLoader);

        AnnotationTypeFilter annotationTypeFilter = new AnnotationTypeFilter(
                ConstantDefine.class);
        scanner.addIncludeFilter(annotationTypeFilter);

        Set<String> basePackages = new HashSet<>();
        basePackages.add(ConstantCenter.class.getPackage().getName());

        for (String basePackage : basePackages) {
            Set<BeanDefinition> candidateComponents = scanner.findCandidateComponents(basePackage);
            for (BeanDefinition candidateComponent : candidateComponents) {
                if (candidateComponent instanceof ScannedGenericBeanDefinition) {
                    ScannedGenericBeanDefinition sgBeanDefinition = (ScannedGenericBeanDefinition) candidateComponent;
//                    sgBeanDefinition.getMetadata().
                }
//                candidateComponent
                System.out.println(candidateComponent);
            }
        }
    }

    private ClassPathScanningCandidateComponentProvider getScanner() {
        return new ClassPathScanningCandidateComponentProvider(false) {

//            @Override
//            protected boolean isCandidateComponent(
//                    AnnotatedBeanDefinition beanDefinition) {
//                if (beanDefinition.getMetadata().isIndependent()) {
//                    // TODO until SPR-11711 will be resolved
//                    if (beanDefinition.getMetadata().isInterface()
//                            && beanDefinition.getMetadata()
//                            .getInterfaceNames().length == 1
//                            && Annotation.class.getName().equals(beanDefinition
//                            .getMetadata().getInterfaceNames()[0])) {
//                        try {
//                            Class<?> target = ClassUtils.forName(
//                                    beanDefinition.getMetadata().getClassName(),
//                                    ConstantRegistrar.this.classLoader);
//                            return !target.isAnnotation();
//                        }
//                        catch (Exception ex) {
//                            this.logger.error(
//                                    "Could not load target class: "
//                                            + beanDefinition.getMetadata().getClassName(),
//                                    ex);
//
//                        }
//                    }
//                    return true;
//                }
//                return false;
//
//            }
        };
    }
}

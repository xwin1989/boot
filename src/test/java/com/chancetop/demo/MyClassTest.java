package com.chancetop.demo;

import com.chancetop.demo.controller.MyAliasAnnotation;
import com.chancetop.demo.controller.MyClass;
import org.junit.jupiter.api.Test;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.Assert;

import java.util.function.Consumer;

public class MyClassTest {
    
    @Test
    public void test1() throws NoSuchMethodException {
        Consumer<MyAliasAnnotation> logic = a -> {
            Assert.isTrue("这是值1".equals(a.value()));
            Assert.isTrue("这是值2".equals(a.location()));
        };
 
        MyAliasAnnotation aliasAnnotation = AnnotationUtils.findAnnotation(MyClass.class.getMethod("one"), MyAliasAnnotation.class);
        logic.accept(aliasAnnotation);
 
        MyAliasAnnotation aliasAnnotation2 = AnnotationUtils.findAnnotation(MyClass.class.getMethod("one2"), MyAliasAnnotation.class);
        logic.accept(aliasAnnotation2);
 
    }
 
}
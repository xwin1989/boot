package com.chancetop.demo.controller;

public class MyClass {
 
    @MyAliasAnnotation(location = "这是值1")
    public static void one(){
    }
 
    @MyAliasAnnotation(value = "这是值2")
    public static void one2(){
    }
}
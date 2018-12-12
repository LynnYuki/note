package com.gree.maven01.model;
import java.beans.Transient;

import com.gree.maven01.model.HelloWorld;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWorldTest{
    @Test
    public void testHello(){
        Assert.assertEquals("Hello World!",new HelloWorld().sayHello());
    }
}
package com.lks.demo.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by likaisong on 2019/4/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class BlogPropertiesTest {

    @Autowired
    private BlogProperties properties;

    @Test
    public void testProperties(){
        Assert.assertEquals(properties.getName(), "lks");
        Assert.assertEquals(properties.getTitle(), "spring-boot-demo");
    }
}

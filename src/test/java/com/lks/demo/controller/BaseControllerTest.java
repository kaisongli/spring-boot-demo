package com.lks.demo.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by likaisong on 2019/4/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseControllerTest {

    @Autowired
    private WebApplicationContext context;

    protected MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        // 构造MockMvc
        mvc = MockMvcBuilders.webAppContextSetup(context).build();

    }
}

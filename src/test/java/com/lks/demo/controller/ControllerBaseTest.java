package com.lks.demo.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by likaisong on 2019/4/7.
 */
@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockServletContext.class)
public class ControllerBaseTest {

    protected MockMvc mockMvc;

    @Before
    public void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }
}
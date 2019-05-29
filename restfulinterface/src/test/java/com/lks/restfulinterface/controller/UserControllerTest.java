package com.lks.restfulinterface.controller;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by likaisong on 2019/4/12.
 */
public class UserControllerTest extends BaseControllerTest{

    @Test
    public void testGetUserList() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/users/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));
    }

    @Test
    public void testPostUser() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/users/")
                .param("userId", "1")
                .param("name", "lks")
                .param("age", "0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("success")));
    }

    @Test
    public void testGetUser() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/users/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testPutUser() throws Exception {
        mvc.perform(MockMvcRequestBuilders.put("/users/1")
                .param("name", "test")
                .param("age", "10")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}

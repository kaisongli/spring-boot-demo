package com.lks.demo.controller;

import com.lks.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by likaisong on 2019/4/12.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
    static Map<Long, User> userMap = new ConcurrentHashMap<>();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList(){
        List<User> users = new ArrayList<>(userMap.values());
        return users;
    }

    /**
     * 创建用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
        //创建user
        userMap.put(user.getUserId(), user);
        return "success";
    }

    /**
     * 根据userId获取用户
     * @param userId
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Long userId){
        return userMap.get(userId);
    }

    /**
     * 根据id更新user信息
     * @param userId
     * @param user
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@PathVariable("id") Long userId,  @ModelAttribute User user){
        User oldUser = userMap.get(userId);
        oldUser.setName(user.getName());
        oldUser.setAge(user.getAge());
        userMap.put(userId, oldUser);
        return "success";
    }

    /**
     * 根据userId删除user
     * @param userId
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long userId){
        userMap.remove(userId);
        return "success";
    }


}

package com.passwd.main.controller;

import com.passwd.main.domain.UserData;
import com.passwd.main.service.UserdataService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * <br/>Date: 2023/2/13
 * <br/>Time: 22:43
 */

@RequestMapping("/i")
@RestController
public class IndexController {

    @Autowired
    private UserdataService userdataService;

    @GetMapping("/status")
    public  Object status(){
        return  2023;
    }

    @PostMapping("/up")
    public Object update(@RequestBody UserData userData){
        System.out.println("浏览器参数"+userData);

        Boolean b=userdataService.saveAndCheck(userData);

        Map<String,Object> res=new HashMap<>();
        res.put("status",b);
        res.put("id",userData.getId());
        return res;
    }

}

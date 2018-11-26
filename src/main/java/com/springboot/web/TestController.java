package com.springboot.web;

import com.springboot.MyException;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @Value("${com.springboot.example.name}")
    private String name;

    @GetMapping("/hello")
    public String index() throws Exception{
        throw new Exception("发生错误");
    }

    @GetMapping("/hello1")
    public String index1() throws Exception{
        throw new RuntimeException("哈哈");
    }

    @GetMapping("/myError")
    public String myError() throws Exception{
        throw new MyException("myException");
    }

    @GetMapping("/userTest")
    public String userTest() throws Exception{
        return userService.count()+"";
    }

    @GetMapping("/test")
    public ModelAndView index(ModelMap map) {
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("host","fsfsf");
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return new ModelAndView("index");
    }
}

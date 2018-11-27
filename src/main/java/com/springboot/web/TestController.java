package com.springboot.web;

import com.springboot.MyException;
import com.springboot.entity.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

//@RestController
@Controller
public class TestController {
    @Autowired
    private UserService userService;

    @Value("${com.springboot.example.name}")
    private String name;

    @GetMapping("/hello")
    public String index() throws Exception{
        throw new Exception("发生错误");
    }

    @PostMapping("/hello1")
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
    public String index(ModelMap map) {
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("host","fsfsf");
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    @RequestMapping("index")
    public String index(Map<String, Object> map) {
        map.put("msg", "this is model view test");
        return "index";
    }

    @RequestMapping("/modelTest")
    public String modelTest(HashMap<String, Object> map, Model model) {
//        model.addAttribute("say","欢迎欢迎,热烈欢迎");
        map.put("hello", "欢迎进入HTML页面");

        User user = new User();
        user.setAge(1);

        map.put("user",user);

        return "index";
    }

}

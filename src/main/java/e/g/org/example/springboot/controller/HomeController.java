package e.g.org.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/Test")在以前的版本中可以加上这个注解
public class HomeController {
    @RequestMapping("/index")
    public String index() {
        return "你好，欢迎使用！";
    }
}

package cn.jiyun.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {
    @RequestMapping("index")
    public String index(){
        return "我是springboot项目";
    }
}
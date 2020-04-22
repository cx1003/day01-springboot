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
    @RequestMapping("index2")
    public String index2(){
        return "我是springboot";
    }
}

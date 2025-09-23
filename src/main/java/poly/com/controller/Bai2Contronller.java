package poly.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bai2Contronller {
    @RequestMapping("/poly/hello")

    public String hello(){
        return "hello";
    }
}

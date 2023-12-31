package shop.mtcoding.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        String hello = "Helloworld";

        request.setAttribute("Hello", hello);

        System.out.println(hello);

        return "hello";
    }
}

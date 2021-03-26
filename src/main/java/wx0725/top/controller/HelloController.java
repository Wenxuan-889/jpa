package wx0725.top.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wx0725.top.domain.CommentMain;
import wx0725.top.mapper.CommentMapper;


@Controller
public class HelloController {

    @ResponseBody
    @GetMapping(value = {"/helloworld", "/hello" })
    public String hello(){
        return "<h1>Hello World !</h1>";
    }

    @GetMapping(value = {"/index", "/"})
    public String index(){
        return "index";
    }

}

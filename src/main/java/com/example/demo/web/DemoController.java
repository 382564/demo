package com.example.demo.web;

import com.example.demo.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ab")
public class DemoController {

    @RequestMapping("/cd")
    public Result testHttpClient() {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("操作成功");
        return result;
    }

    @RequestMapping("/ef")
    public Result test() {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("操作成功");
        return result;
    }
}

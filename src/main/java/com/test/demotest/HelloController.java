package com.test.demotest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Administrator
 */
@RestController
public class HelloController {

    @RequestMapping("info")
    public  String info(){
        return "你好啊";
    }
}

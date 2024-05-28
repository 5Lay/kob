package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WuLei
 * @Description
 * @create 2024-05-28-上午9:20
 */
@Controller
@RequestMapping("/pk/")
public class indexController {

    @RequestMapping("index/")
    public String index(){
        return "pk/index.html";
    }
}

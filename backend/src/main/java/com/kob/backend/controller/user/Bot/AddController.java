package com.kob.backend.controller.user.Bot;

import com.kob.backend.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author WuLei
 * @Description
 * @create 2024-06-04-上午10:05
 */
@RestController
public class AddController {
    @Autowired
    private AddService addService;

   @PostMapping("/user/bot/add/")
    public Map<String, String> add(@RequestParam Map<String, String> data) {
       return addService.add(data);
   }
}

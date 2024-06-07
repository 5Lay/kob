package com.kob.backend.controller.user.Bot;

import com.kob.backend.pojo.Bot;
import com.kob.backend.service.user.bot.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WuLei
 * @Description
 * @create 2024-06-04-下午2:29
 */
@RestController
public class GetListController {
    @Autowired
    private GetListService getListService;

    @GetMapping("/user/bot/getlist")
    public List<Bot> getlist() {
        return getListService.getList();
    }
}

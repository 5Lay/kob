package com.kob.backend.service.impl.pk;

import com.kob.backend.comsumer.WebSocketServer;
import com.kob.backend.service.pk.StartGameService;
import org.springframework.stereotype.Service;

/**
 * @author WuLei
 * @Description
 * @create 2024-06-07-上午11:26
 */

@Service
public class StartGameServiceImpl implements StartGameService {
    @Override
    public String startGame(Integer aId, Integer bId) {
        System.out.println("start game: " + aId + " " + bId);
        WebSocketServer.startGame(aId, bId);
        return "start game success!";
    }
}

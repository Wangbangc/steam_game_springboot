package com.example.demo.service.impl;

import com.example.demo.mapper.GameMapper;
import com.example.demo.model.Game;
import com.example.demo.service.GameService;
import com.example.demo.utils.TransmissionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameMapper gameMapper;


    @Override
    public TransmissionInfo selectAllGames() {
        List<Game> games = gameMapper.selectAllGames();
        return new TransmissionInfo("success", "Games retrieved successfully", games);
    }

}
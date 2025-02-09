package com.example.demo.controller;

import com.example.demo.model.GameTypeStatistics;
import com.example.demo.service.GameService;
import com.example.demo.utils.TransmissionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping("/getAll")
    public TransmissionInfo selectAllGames() {
        return gameService.selectAllGames();
    }

    @GetMapping("/types")
    public TransmissionInfo getAllGameTypes() {
        return gameService.selectAllGameType();
    }
}
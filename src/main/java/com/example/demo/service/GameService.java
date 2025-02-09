package com.example.demo.service;

import com.example.demo.model.GameTypeStatistics;
import com.example.demo.utils.TransmissionInfo;

import java.util.List;

public interface GameService {
    // 其他方法...
    TransmissionInfo selectAllGames();
    TransmissionInfo selectAllGameType();
}
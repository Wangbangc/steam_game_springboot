package com.example.demo.mapper;

import com.example.demo.model.Game;
import com.example.demo.model.GameTypeStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GameMapper {


    @ResultMap("gameResultMap") // 使用结果映射
    List<Game> selectAllGames();

    List<GameTypeStatistics> selectAllGameType();
}
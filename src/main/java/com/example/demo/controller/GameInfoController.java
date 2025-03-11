package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Map;

@RestController

public class GameInfoController {

    @GetMapping("/api/gameinfo")
    public String getGameInfo(@RequestParam String gameName) throws IOException {
        String searchUrl = "https://v2.diershoubing.com/eb/combine_game/search/?src=ios&version=9.54&search_name=" + gameName;

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(searchUrl);

        try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
            String json = EntityUtils.toString(response.getEntity());
            Gson gson = new Gson();
            Map<String, Object> data = gson.fromJson(json, Map.class);

            // 在这里你可以继续解析游戏ID，并调用二柄游戏详情 API 和评论 API
            // 这里只返回搜索结果作为示例

            return json;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
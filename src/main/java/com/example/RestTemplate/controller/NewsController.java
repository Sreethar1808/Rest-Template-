package com.example.RestTemplate.controller;

import com.example.RestTemplate.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/vq/")
public class NewsController {

    @Autowired
    NewsService newsService;


    @GetMapping
    public Object getnews(@RequestParam("Country-code") String countrycode,@RequestParam("api-key") String apiKey)
    {
         return newsService.getNews(countrycode, apiKey);
    }
}

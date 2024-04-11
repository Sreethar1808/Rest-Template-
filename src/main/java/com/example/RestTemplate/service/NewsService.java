package com.example.RestTemplate.service;

import com.example.RestTemplate.dto.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Autowired
    RestTemplate restTemplate;



    String basicurl ="https://newsapi.org/v2/top-headlines?country=";
    public Object getNews(String countrycode, String apiKey)
    {
          String url = prepareurl(countrycode,apiKey);
          NewsResponse response = restTemplate.getForObject(url,NewsResponse.class);
          return response;
    }

    private String prepareurl(String countrycode, String apikey)
    {
        return basicurl + countrycode +'&'+ "apiKey=" + apikey;
    }
}

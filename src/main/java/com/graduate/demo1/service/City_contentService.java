package com.graduate.demo1.service;



import com.graduate.demo1.model.City_content;

import java.util.List;

public interface City_contentService {
    List<City_content> findbyCity(String city);
    List<City_content> findCity_contentsByOrder(int order, String city);
}

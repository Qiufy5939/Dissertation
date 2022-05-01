package com.graduate.demo1.service;


import com.graduate.demo1.model.City_info;

import java.util.List;

public interface City_infoService {
    List<City_info> findCity_infosByCityAndAge(String city,String min_age,String max_age);
    List<City_info> findAll();
    int findOrder(String time,String city);
//    boolean save(City_info city_info);
//    boolean delete(String id);
//    boolean update(City_info city_info);
}

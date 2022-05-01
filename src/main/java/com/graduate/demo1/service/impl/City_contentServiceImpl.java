package com.graduate.demo1.service.impl;

import com.graduate.demo1.dao.City_contentDao;
import com.graduate.demo1.model.City_content;
import com.graduate.demo1.model.City_content;
import com.graduate.demo1.service.City_contentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class City_contentServiceImpl implements City_contentService {
    @Resource
    private City_contentDao city_contentDao;

    @Override
    public List<City_content> findbyCity(String city) {
        return city_contentDao.findCity_contentsByCity(city);
    }


    @Override
    public List<City_content> findCity_contentsByOrder(int order, String city) {
        return city_contentDao.getCity_contentsByOrder(order, city);
    }
}
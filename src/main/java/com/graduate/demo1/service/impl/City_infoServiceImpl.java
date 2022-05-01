package com.graduate.demo1.service.impl;


import com.graduate.demo1.dao.City_infoDao;
import com.graduate.demo1.model.City_info;
import com.graduate.demo1.service.City_infoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class City_infoServiceImpl implements City_infoService {
    @Resource
    private City_infoDao city_infoDao;


    @Override
    public List<City_info> findCity_infosByCityAndAge(String city, String min_age, String max_age) {
        return city_infoDao.getCity_infosByCityAndAge(city,min_age,max_age);
    }

    @Override
    public List<City_info> findAll() {
        return city_infoDao.findCity_infos();
    }

    @Override
    public int findOrder(String time,String city) {
        return city_infoDao.getOrder(time,city);
    }
}

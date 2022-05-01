package com.graduate.demo1.service.impl;

import com.graduate.demo1.dao.RoadDao;
import com.graduate.demo1.model.Road;
import com.graduate.demo1.service.RoadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoadServiceImpl implements RoadService {
    @Resource
    private RoadDao roadDao;
    @Override
    public List<Road> findRoadsByCity(String city) {
        return roadDao.getRoadsByCity(city);
    }

    @Override
    public Road findRoadByAge(String age) {
        return roadDao.getRoadByAge(age);
    }
}

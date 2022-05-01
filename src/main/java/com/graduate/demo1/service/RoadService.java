package com.graduate.demo1.service;

import com.graduate.demo1.model.Road;

import java.util.List;

public interface RoadService {
    List<Road> findRoadsByCity(String city);
    Road findRoadByAge(String age);
}

package com.graduate.demo1.dao;

import com.graduate.demo1.model.Road;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoadDao {
    //通过city查询Road
    List<Road> getRoadsByCity(@Param("city") String city);
    //通过age查询Road
    Road getRoadByAge(@Param("age") String age);
}

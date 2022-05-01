package com.graduate.demo1.dao;

import com.graduate.demo1.model.City_content;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface City_contentDao {
    //新增City_content
    boolean saveCity_content(City_content city_content);
    //通过city查找City_content
    List<City_content> findCity_contentsByCity(@Param("city") String city);
    //删除City_content
    boolean deleteCity_content(String city);
    //更新City_content
    boolean updateCity_content(City_content city_content);
    //通过order和city获取那一部分的city_contents
    List<City_content> getCity_contentsByOrder(int order,String city);
}

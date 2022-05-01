package com.graduate.demo1.dao;

import com.graduate.demo1.model.City_info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface City_infoDao {
    //新增City_info
    boolean saveCity_info(City_info city_info);
    //通过city和age上下限查找City_info
    List<City_info> getCity_infosByCityAndAge(@Param("city") String city,@Param("min_age") String min_age,@Param("max_age") String max_age);
    //查找所有City_info
    List<City_info> findCity_infos();
    //删除City_info
    boolean deleteCity_info(String city);
    //更新City_info
    boolean updateCity_info(City_info city_info);
    //通过time和city获取order序号
    int getOrder(String time, String city);
}

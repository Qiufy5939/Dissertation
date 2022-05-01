package com.graduate.demo1.vo;

import com.graduate.demo1.model.City_content;
import com.graduate.demo1.model.City_info;
import com.graduate.demo1.model.Poem_note;
import com.graduate.demo1.model.Road;

import java.util.List;


public class DataVo {
    private List<City_info> city_info;
    private List<List<City_content>> city_content;
    private List<List<List<Poem_note>>> poem_note;
    private List<Road> list_road;

    public List<City_info> getCity_info() {
        return city_info;
    }

    public void setCity_info(List<City_info> city_info) {
        this.city_info = city_info;
    }

    public List<List<City_content>> getCity_content() {
        return city_content;
    }

    public void setCity_content(List<List<City_content>> city_content) {
        this.city_content = city_content;
    }

    public List<List<List<Poem_note>>> getPoem_note() {
        return poem_note;
    }

    public void setPoem_note(List<List<List<Poem_note>>> poem_note) {
        this.poem_note = poem_note;
    }

    public List<Road> getList_road() {
        return list_road;
    }

    public void setList_road(List<Road> list_road) {
        this.list_road = list_road;
    }
}

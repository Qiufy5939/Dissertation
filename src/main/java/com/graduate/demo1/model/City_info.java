package com.graduate.demo1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city_info")
public class City_info{
    @Id
    private String city;
    private String time;
    private String age;
    private int order;

    public City_info(){

    };
    public City_info(String city, String time, String age,int order) {
        this.city = city;
        this.time = time;
        this.age = age;
        this.order = order;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}

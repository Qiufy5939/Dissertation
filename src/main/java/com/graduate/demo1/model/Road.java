package com.graduate.demo1.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "road")
public class Road {
    @Id
    private String city;
    private String date;
    private String age;
    private String route;

    public Road(){

    }

    public Road(String city, String date,String age, String route) {
        this.city = city;
        this.date = date;
        this.age = age;
        this.route = route;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return age;
    }

    public void setTime(String age) {
        this.age = age;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}

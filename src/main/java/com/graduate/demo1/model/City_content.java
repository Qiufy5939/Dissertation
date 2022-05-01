package com.graduate.demo1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city_content")
public class City_content {
    @Id
    private String date;
    private String city;
    private String content;
    private int order;
    private String tip;
    private String poem_name;
    private String poem_content;

    public City_content(){

    }

    public City_content(String date, String city, String content, int order, String tip, String poem_name, String poem_content) {
        this.date = date;
        this.city = city;
        this.content = content;
        this.order = order;
        this.tip = tip;
        this.poem_name = poem_name;
        this.poem_content = poem_content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getPoem_name() {
        return poem_name;
    }

    public void setPoem_name(String poem_name) {
        this.poem_name = poem_name;
    }

    public String getPoem_content() {
        return poem_content;
    }

    public void setPoem_content(String poem_content) {
        this.poem_content = poem_content;
    }
}

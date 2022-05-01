package com.graduate.demo1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "poem_note")
public class Poem_note {
    @Id
    private String note_name;
    private String note_pinyin;
    private String note_content;
    private String poem_name;

    public Poem_note(){

    }

    public Poem_note(String note_name, String note_pinyin, String note_content, String poem_name) {
        this.note_name = note_name;
        this.note_pinyin = note_pinyin;
        this.note_content = note_content;
        this.poem_name = poem_name;
    }

    public String getNote_name() {
        return note_name;
    }

    public void setNote_name(String note_name) {
        this.note_name = note_name;
    }

    public String getNote_pinyin() {
        return note_pinyin;
    }

    public void setNote_pinyin(String note_pinyin) {
        this.note_pinyin = note_pinyin;
    }

    public String getNote_content() {
        return note_content;
    }

    public void setNote_content(String note_content) {
        this.note_content = note_content;
    }

    public String getPoem_name() {
        return poem_name;
    }

    public void setPoem_name(String poem_name) {
        this.poem_name = poem_name;
    }
}

package com.kahfi.arief.springbootwebsocket.com.arief.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_text")
public class Text {


    @Id
    @GeneratedValue
    private int id;

    @Column
    private String text;


    public Text(){}

    public Text(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

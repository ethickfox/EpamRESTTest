package com.epam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Advertisement {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String email;
    private String text;

    public Advertisement(String author, String email, String text) {
        this.author = author;
        this.email = email;
        this.text = text;
    }

    public Advertisement() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

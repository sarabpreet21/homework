package com.project.homework.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id",nullable = false,updatable = false)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String contact;
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emaill) {
        this.email = emaill;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public User(Long id, String name, String emaill, String password, String contact,String imageUrl) {
        this.id = id;
        this.name = name;
        this.email = emaill;
        this.password = password;
        this.contact = contact;
        this.imageUrl = imageUrl;
    }

    public User() {
    }
}

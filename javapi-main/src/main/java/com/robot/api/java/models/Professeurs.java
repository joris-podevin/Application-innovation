package com.robot.api.java.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Professeurs {

    @Id
    private String name;

    private String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

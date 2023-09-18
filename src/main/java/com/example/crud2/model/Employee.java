package com.example.crud2.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id//annotation dinh nghia cho id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//giup cho id tu tang
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    public Employee() {
    }

    public Employee(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

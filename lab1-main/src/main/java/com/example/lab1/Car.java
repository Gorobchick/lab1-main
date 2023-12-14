package com.example.lab1;

import com.example.lab1.details.Details;

public class Car {

    private String name;
    private Details body;
    private Details wheels;
    private Details cabin;

    public Car() {
    }

    // setters-----------------------------------------------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setBody(Details body) {
        this.body = body;
    }

    public void setWheels(Details wheels) {
        this.wheels = wheels;
    }

    public void setCabin(Details cabin) {
        this.cabin = cabin;
    }

    // getters-----------------------------------------------------------------------------------------
    public String getName() {
        return this.name;
    }

    public Details getBody() {
        return this.body;
    }

    public Details getWheels() {
        return this.wheels;
    }

    public Details getCabin() {
        return this.cabin;
    }

}

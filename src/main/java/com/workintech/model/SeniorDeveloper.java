package com.workintech.model;

public class SeniorDeveloper extends Developer {
    public SeniorDeveloper(Integer id, String name, Double salary) {
        super(id, name, salary, Experience.SENIOR);
    }
}

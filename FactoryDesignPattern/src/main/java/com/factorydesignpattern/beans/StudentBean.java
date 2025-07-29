package com.factorydesignpattern.beans;

public class StudentBean {
    private String name;
    private String City;
    
     public StudentBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    @Override
    public String toString() {
        return "StudentBean{" + "name=" + name + ", City=" + City + '}';
    }
    
   
    
    
}

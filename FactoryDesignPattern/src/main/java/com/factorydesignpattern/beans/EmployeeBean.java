
package com.factorydesignpattern.beans;


public class EmployeeBean {
    private String name;
    private String designation;

    public EmployeeBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" + "name=" + name + ", designation=" + designation + '}';
    }
}

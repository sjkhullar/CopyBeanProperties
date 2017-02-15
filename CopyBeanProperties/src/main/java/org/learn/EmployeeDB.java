package org.learn;

import java.util.Date;

public class EmployeeDB {
    private String firstName;
    private String lastName;
    private int age;
    private int experience;
    private int salary;
    private Date createdDate;
    private Date modifiedDate;

    public EmployeeDB(String firstName, String lastName, int age, int experience,
                      int salary, Date createdDate, Date modifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return String.format("[Name:%s %s,Age:%d,Salary:%d,Experience:%d]",
                        firstName,lastName,age,salary,experience);
    }
}

package org.example;

public class Person {
    private int id;
    private String name;
    private String gender;
    private Department department;
    private int salary;
    private String birthDate;
    public Person(int _id, String _name, String _gender, Department _department, int _salary, String _birthDate) {
        id = _id;
        name = _name;
        gender = _gender;
        department = _department;
        salary = _salary;
        birthDate = _birthDate;
    }
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public Department getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setID(int _id) {
        id = _id;
    }
    public void setName(String _name) {
        name = _name;
    }
    public void setGender(String _gender) {
        gender = _gender;
    }
    public void setDepartment(Department _department) {
        department = _department;
    }
    public void setSalary(int _salary) {
        salary = _salary;
    }
    public void setBirthDate(String _birthDate) {
        birthDate = _birthDate;
    }
}

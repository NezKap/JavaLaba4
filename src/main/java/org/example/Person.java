package org.example;

/**
 * Класс, содержащий данные о
 * конкретном человеке из
 * заданного CSV файла
 * @author Егор
 * @version 1.0
 */

public class Person {
    private int id;
    private String name;
    private String gender;
    private Department department;
    private int salary;
    private String birthdate;

    /**
     * Конструктор класса Person
     * с заданием всех полей
     * создаваемого объекта
     * @param _id айди человека
     * @param _name имя человека
     * @param _gender пол человека
     * @param _department подразделение, в котором состоит данный человек
     * @param _salary зарплата данного человека
     * @param _birthdate дата рождения данного человека
     */

    public Person(int _id, String _name, String _gender, Department _department, int _salary, String _birthdate) {
        id = _id;
        name = _name;
        gender = _gender;
        department = _department;
        salary = _salary;
        birthdate = _birthdate;
    }

    /**
     * Получение айди данного человека
     * @return айди человека
     */

    public int getID() {
        return id;
    }

    /**
     * Получение имени данного человека
     * @return имя человека
     */

    public String getName() {
        return name;
    }

    /**
     * Получение пола данного человека
     * @return пол человека
     */

    public String getGender() {
        return gender;
    }

    /**
     * Получение информации о подразделении
     * данного человека
     * @return информация о подразделении
     */

    public Department getDepartment() {
        return department;
    }

    /**
     * Получение зарплаты данного человека
     * @return зарплата человека
     */

    public int getSalary() {
        return salary;
    }

    /**
     * Получение даты рождения данного человека
     * @return дата рождения человека
     */

    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Установление айди данного человека
     * @param _id айди человека
     */

    public void setID(int _id) {
        id = _id;
    }

    /**
     * Установление имени данного человека
     * @param _name имя человека
     */

    public void setName(String _name) {
        name = _name;
    }

    /**
     * Установление пола данного человека
     * @param _gender пол человека
     */

    public void setGender(String _gender) {
        gender = _gender;
    }

    /**
     * Установление данных о подразделении данного человека
     * @param _department объект класса Department, содержащий данные о подразделении человека
     */

    public void setDepartment(Department _department) {
        department = _department;
    }

    /**
     * Установление зарплаты данного человека
     * @param _salary зарплата человека
     */

    public void setSalary(int _salary) {
        salary = _salary;
    }

    /**
     * Установление даты рождения данного человека
     * @param _birthdate дата рождения человека
     */

    public void setBirthdate(String _birthdate) {
        birthdate = _birthdate;
    }

    /**
     * Метод вывода данных о данном человеке
     * в виде строки
     * @return строка, содержащая информацию о данном человеке
     */

    @Override
    public String toString() {
        return "ID: " + id + ", name: " + name + ", gender: " + gender + ", department: " + department + ", salary: " +
                salary + ", birthdate: " + birthdate;
    }
}

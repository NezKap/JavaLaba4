package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс для проведения unit-тестов
 * для проверки корректной работы
 * методов классов CSVReader, Person и Department
 * @author Егор
 * @version 1.0
 */

public class Laba4Test {

    /**
     * Тестирование работы конструкторов классов
     * Department, Person и CSVReader
     */

    @Test
    void create() {
        Department department = new Department("E");
        assertEquals("E", department.getName());
        assertEquals(4, department.getID());
        Person person = new Person(54178, "Zyta", "Female", new Department("H"), 7600,
                "16.04.1955");
        assertEquals(54178, person.getID());
        assertEquals("Zyta", person.getName());
        assertEquals("Female", person.getGender());
        assertEquals("H", person.getDepartment().getName());
        assertEquals(7, person.getDepartment().getID());
        assertEquals(7600, person.getSalary());
        assertEquals("16.04.1955", person.getBirthdate());
        String fileName = "src/main/resources/foreign_names.csv";
        CSVReader csvReader = new CSVReader(fileName);
        assertEquals("src/main/resources/foreign_names.csv", csvReader.getFileName());
    }

    /**
     * Тестирование работы метода set
     * в объектах классов Department, Person и CSVReader
     */

    @Test
    void set() {
        Department department = new Department("E");
        department.setName("H");
        assertEquals("H", department.getName());
        assertEquals(7, department.getID());
        Person person = new Person(54178, "Zyta", "Female", new Department("H"), 7600,
                "16.04.1955");
        person.setID(54177);
        assertEquals(54177, person.getID());
        person.setName("Zyana");
        assertEquals("Zyana", person.getName());
        person.setGender("Male");
        assertEquals("Male", person.getGender());
        person.setDepartment(new Department("O"));
        assertEquals("O", person.getDepartment().getName());
        assertEquals(14, person.getDepartment().getID());
        person.setSalary(8900);
        assertEquals(8900, person.getSalary());
        person.setBirthdate("08.07.1934");
        assertEquals("08.07.1934", person.getBirthdate());
        String fileName = "src/main/resources/foreign_names.csv";
        CSVReader csvReader = new CSVReader(fileName);
        csvReader.setFileName("src/main/resources/foreign_surnames.csv");
        assertEquals("src/main/resources/foreign_surnames.csv", csvReader.getFileName());
    }
}

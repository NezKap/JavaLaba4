package org.example;

/**
 * Класс, содержащий данные о
 * конкретном подразделении из
 * заданного CSV файла
 * @author Егор
 * @version 1.0
 */

public class Department {
    private int id;
    private String name;

    /**
     * Конструктор класса Department
     * с генерируемым программно
     * айди подразделения
     * @param _name имя подразделения
     */

    public Department(String _name) {
        name = _name;
        id = _name.charAt(0) - 'A';
    }

    /**
     * Получение айди текущего подразделения
     * @return айди подразделения
     */

    public int getID() {
        return id;
    }

    /**
     * Получение имени текущего подразделения
     * @return имя подразделения
     */

    public String getName() {
        return name;
    }

    /**
     * Установление имени текущего подразделения
     * @param _name имя подразделения
     */

    public void setName(String _name) {
        name = _name;
        id = _name.charAt(0) - 'A';
    }

    /**
     * Метод вывода данных о текущем подразделении
     * в виде строки
     * @return строка, содержащая данные о текущем подразделении
     * через запятую
     */

    @Override
    public String toString() {
        return id + ", " + name;
    }
}

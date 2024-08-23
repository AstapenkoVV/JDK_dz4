package ru.gb.lisson4_dz;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавления нового сотрудника в справочник
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        EmployeeDirectory employeeDirectory = new EmployeeDirectory(employees);

        Employee employee1 = new Employee(001, "Ivan", "+7(999)111-22-33", 2);
        Employee employee2 = new Employee(002, "Anton", "+7(777)555-88-99", 4);
        Employee employee3 = new Employee(003, "Alex", "+7(980)333-12-32", 1);
        Employee employee4 = new Employee(004, "Petr", "+7(990)123-65-32", 7);
        Employee employee5 = new Employee(005, "Konstantin", "+7(930)321-45-31", 11);
        Employee employee6 = new Employee(006, "Roman", "+7(950)113-35-33", 8);
        Employee employee7 = new Employee(007, "Olga", "+7(960)643-24-31", 5);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        System.out.println(employeeDirectory.findEmployeeInExperience(employees, 2));
        System.out.println(employeeDirectory.findPhoneInName(employees, "Alex"));
        System.out.println(employeeDirectory.findIdInName(employees, 002));
        employeeDirectory.addNewEmployee(employees, employee7);
    }
}

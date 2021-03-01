package ua.mytestprojects.springapp.repository;

import java.util.List;

public interface CustomizedEmployees<T> {
    List<T> getEmployeesMaxSalary();
    void delete(T entity);
}

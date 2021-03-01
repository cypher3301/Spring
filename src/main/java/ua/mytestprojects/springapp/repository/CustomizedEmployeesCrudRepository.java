package ua.mytestprojects.springapp.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import ua.mytestprojects.springapp.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface CustomizedEmployeesCrudRepository extends CrudRepository<EmployeeEntity, Long>, CustomizedEmployees<EmployeeEntity> {
    // искать по полям firstName And LastName
    Optional<EmployeeEntity> findByFirstNameAndLastName(String firstName, String lastName);
    // найти первые 5 по FirstName начинающихся с символов и сортировать по FirstName
    List<EmployeeEntity> findFirst5ByFirstNameStartsWithOrderByFirstName(String firstNameStartsWith);
    List<EmployeeEntity> findByFirstNameStartsWith(String firstNameStartsWith, Pageable pageable);
}

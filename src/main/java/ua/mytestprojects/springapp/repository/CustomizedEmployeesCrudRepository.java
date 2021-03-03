package ua.mytestprojects.springapp.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ua.mytestprojects.springapp.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface CustomizedEmployeesCrudRepository extends CrudRepository<EmployeeEntity, Long>, CustomizedEmployees<EmployeeEntity> {
    // искать по полям firstName And LastName
    Optional<EmployeeEntity> findByFirstNameAndLastName(String firstName, String lastName);

    // найти первые 5 по FirstName начинающихся с символов и сортировать по FirstName
    List<EmployeeEntity> findFirst5ByFirstNameStartsWithOrderByFirstName(String firstNameStartsWith);

    List<EmployeeEntity> findByFirstNameStartsWith(String firstNameStartsWith, Pageable pageable);

    //запросы
    @Query("select c from EmployeeEntity c where c.country='USA'")
    List<EmployeeEntity> findEmployeeWithCounty(@Param("country") String country, Sort sort);

    //модифицирование запросы
    @Modifying
    @Query("update EmployeeEntity e set e.firstName = ?1 where e.employeeId=?2")
    int setFirstNameFor(String firstName, String employeeId);
}

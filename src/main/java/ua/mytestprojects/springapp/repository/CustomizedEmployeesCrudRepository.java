package ua.mytestprojects.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import ua.mytestprojects.springapp.entity.EmployeeEntity;

public interface CustomizedEmployeesCrudRepository extends CrudRepository<EmployeeEntity, Long> {
}

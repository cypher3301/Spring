package ua.mytestprojects.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ua.mytestprojects.springapp.entity.EmployeeEntity;
import ua.mytestprojects.springapp.repository.CustomizedEmployeesCrudRepository;

import java.util.Optional;

public class EmployeesDataService {
    @Autowired
    private CustomizedEmployeesCrudRepository employeesCrudRepository;

    @Transactional
    public void testEmployeesCrudRepository(){
        Optional<EmployeeEntity> entityOptional = employeesCrudRepository.findById(12L);
    }
}

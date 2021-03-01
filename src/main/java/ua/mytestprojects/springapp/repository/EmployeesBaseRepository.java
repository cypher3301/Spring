package ua.mytestprojects.springapp.repository;

import ua.mytestprojects.springapp.entity.EmployeeEntity;

public interface EmployeesBaseRepository extends BaseRepository<EmployeeEntity, Long> {
    @Override
    void delete(EmployeeEntity entity);
}

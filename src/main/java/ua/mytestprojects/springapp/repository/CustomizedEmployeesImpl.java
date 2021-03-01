package ua.mytestprojects.springapp.repository;

import org.springframework.transaction.annotation.Transactional;
import ua.mytestprojects.springapp.entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CustomizedEmployeesImpl implements CustomizedEmployees{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getEmployeesMaxSalary() {
        return entityManager.createQuery("from EmployeeEntity where title like '%Sale%'", EmployeeEntity.class).getResultList();
    }

    @Transactional
    @Override
    public void delete(Object entity) {
        EmployeeEntity employeeEntity = (EmployeeEntity) entity;
        employeeEntity.setDeleted(true);
        entityManager.persist(employeeEntity);
    }
}

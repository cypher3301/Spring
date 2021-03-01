import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.transaction.annotation.Transactional;
import ua.mytestprojects.springapp.entity.EmployeeEntity;
import ua.mytestprojects.springapp.repository.CustomizedEmployeesCrudRepository;
import ua.mytestprojects.springapp.repository.EmployeesBaseRepository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

public class DemoSpringDataApplicationTests {
    @Autowired
    private CustomizedEmployeesCrudRepository crudRepository;

    @Resource
    private EmployeesBaseRepository employeesBaseRepository;

    @Test
    @Transactional
    public void testGetSaleAgentEmployees() {
        List<EmployeeEntity> employeeEntityList = crudRepository.getEmployeesMaxSalary();
        employeeEntityList.stream().forEach(employeeEntity -> System.out.println(
                employeeEntity.getFirstName() + " " +
                        employeeEntity.getLastName() + " " +
                        employeeEntity.getTitle()));
    }


    @Test
    @Transactional
//    @Commit
    public void testBaseRepository(){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setLastName("Ivanov");
        Example<EmployeeEntity> example = Example.of(employeeEntity);
        Optional<EmployeeEntity> entityOptional = employeesBaseRepository.findOne(example);
        entityOptional.ifPresent(employeesBaseRepository::delete);
    }
}

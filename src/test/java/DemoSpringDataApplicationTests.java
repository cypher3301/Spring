import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ua.mytestprojects.springapp.entity.EmployeeEntity;
import ua.mytestprojects.springapp.repository.CustomizedEmployeesCrudRepository;

import java.util.List;

public class DemoSpringDataApplicationTests {
    @Autowired
    private CustomizedEmployeesCrudRepository crudRepository;

    @Test
    @Transactional
    public void testGetSaleAgentEmployees() {
        List<EmployeeEntity> employeeEntityList = crudRepository.getEmployeesMaxSalary();
        employeeEntityList.stream().forEach(employeeEntity -> System.out.println(
                employeeEntity.getFirstName() + " " +
                        employeeEntity.getLastName() + " " +
                        employeeEntity.getTitle()));
    }
}

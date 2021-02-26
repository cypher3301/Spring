import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import ua.mytestprojects.springapp.entity.CustomerEntity;
import ua.mytestprojects.springapp.entity.EmployeeEntity;
import ua.mytestprojects.springapp.repository.CustomizedEmployeesCrudRepository;

import java.util.Optional;

@SpringBootTest
public class SomeTest {
    @Autowired
    private CustomizedEmployeesCrudRepository employeesCrudRepository;

    @Test
    @Transactional
    public void testFindByFirstNameAndLastName(){
        Optional<EmployeeEntity> customerEntity = employeesCrudRepository.findByFirstNameAndLastName("Michelle","Brooks");
        System.out.println(customerEntity.map(e-> e.getFirstName() + " " + e.getLastName()).orElse("Not found"));
    }

}

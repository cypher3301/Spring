import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;
import ua.mytestprojects.springapp.entity.CustomerEntity;
import ua.mytestprojects.springapp.entity.EmployeeEntity;
import ua.mytestprojects.springapp.repository.CustomizedEmployeesCrudRepository;
import ua.mytestprojects.springapp.repository.EmployeesEntityRepository;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class MySpringDataTest {

    @Autowired
    private EmployeesEntityRepository entityRepository;

    @Autowired
    private CustomizedEmployeesCrudRepository employeesCrudRepository;

    @Test
    @Transactional
    public void testFindByFirstNameAndLastName(){
        Optional<EmployeeEntity> customerEntity = employeesCrudRepository.findByFirstNameAndLastName("Michelle","Brooks");
        System.out.println(customerEntity.map(e-> e.getFirstName() + " " + e.getLastName()).orElse("Not found"));
    }
    @Test
    @Transactional
    public void testFindByFirstNameStartsWithOrderByFirstNamePage(){
        List<EmployeeEntity> list = employeesCrudRepository.findByFirstNameStartsWith("A", PageRequest.of(1,3, Sort.by("firstName")));
        list.forEach(e-> System.out.println(e.getFirstName()+" " + e.getLastName()));
    }

    @Test
    @Transactional
    public void testEntityName(){
        List<EmployeeEntity> employeeEntityList = entityRepository.findMarked(true);
    }

}

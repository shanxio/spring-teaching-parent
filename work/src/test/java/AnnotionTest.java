import com.DbConfig;
import com.service.EmployeeService;
import com.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotionTest {
    @Test
    public void testAnnoHelloWorld(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = applicationContext.getBean(EmployeeServiceImpl.class);
        employeeService.update();
    }

    @Test
    public void testDbonfig(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DbConfig dbConfig = applicationContext.getBean(DbConfig.class);
//        System.out.println(dbConfig.getString());
    }
    @Test
    public void testDbonfig2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DbConfig dbConfig = applicationContext.getBean(DbConfig.class);
        System.out.println(dbConfig.getUsername());
    }
}

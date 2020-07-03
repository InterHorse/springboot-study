import cn.interhorse.springboot.lombok.LombokApplication;
import cn.interhorse.springboot.lombok.entity.Person1;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author InterHorse
 * @date 2020-07-03
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {LombokApplication.class})
public class MyTest {
    @Test
    public void testPerson1() {
        Person1 person1 = new Person1();
        person1.setId(1);
        person1.setAge(19);
        person1.setName("Jenny");
        log.info(person1.toString());
    }
}

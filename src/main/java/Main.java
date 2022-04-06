import com.example.Person;
import com.example.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 入口类
 *
 * @author liushangqing
 * @date 2022/4/6 22:01
 */
public class Main {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        // retrieve configured instance
        WelcomeService service = context.getBean("welcomeService", WelcomeService.class);
        // use configured instance
        service.say();

//        AnnotationConfigApplicationContext annotation = new AnnotationConfigApplicationContext(Config_1.class);
//        Map<String, Person> beansOfType = annotation.getBeansOfType(Person.class);
//        for (String s : beansOfType.keySet()) {
//            System.out.println("名字是：" + s);
//            System.out.println(beansOfType.get(s).toString());
//        }

    }
}

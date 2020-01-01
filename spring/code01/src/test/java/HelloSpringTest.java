import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.HelloSpring;

public class HelloSpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        HelloSpring helloSpringBean = (HelloSpring)context.getBean("helloSpringBean");
        helloSpringBean.say("Spring");
    }
}

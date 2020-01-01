import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojo.HelloSpring;
import pojo.HelloSpringImpl;

@Configuration
public class ApplicationConfig {
    @Bean(name = "helloSpringBean")
    public HelloSpring helloSpring(){
        return new HelloSpringImpl();
    }
}

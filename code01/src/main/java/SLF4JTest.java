import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTest {
    //利用Log4jDemo.class作为logger的名称

    public static void main(final String... args) {
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
        logger.info("Hello world");
    }
}

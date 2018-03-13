package eduspring.com.eduspring;

import eduspring.common.config.CommonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CommonConfig.class)
public class EduspringApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduspringApiApplication.class, args);
    }
}

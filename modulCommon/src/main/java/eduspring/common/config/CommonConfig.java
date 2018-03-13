package eduspring.common.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "eduspring.common.*")
@EnableJpaRepositories(basePackages = "eduspring.common.repo.")
@EntityScan(basePackages = "eduspring.common.model")
public class CommonConfig  {
}

package demo.headers.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("demo.headers")
@EnableJpaRepositories("demo.headers")
@EnableTransactionManagement
public class DomainConfig {
}

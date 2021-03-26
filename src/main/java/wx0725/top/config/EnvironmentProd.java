package wx0725.top.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 在生产 环境下使用
 */
@Configuration
@Profile("prod")
public class EnvironmentProd implements EnvironmentConfig{

    @Override
    public void configure() {
        System.out.println("启动生产环境下的配置类");
    }
}

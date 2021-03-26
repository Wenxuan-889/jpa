package wx0725.top.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 在开发环境下使用
 */
@Configuration
@Profile("dev")
public class EnvironmentDev implements EnvironmentConfig{

    @Override
    public void configure() {
        System.out.println("启动开发环境下的配置类");
    }
}

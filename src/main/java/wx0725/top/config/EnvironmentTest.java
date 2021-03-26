package wx0725.top.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 在测试环境下使用
 */
@Configuration
@Profile("test")
public class EnvironmentTest implements EnvironmentConfig{

    @Override
    public void configure() {
        System.out.println("启动测试环境下的配置类");
    }
}

package wx0725.top.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wx0725.top.service.BeanConfiguration;

@Configuration
public class BeanConfigurationConfig {

    @Bean
    public BeanConfiguration beanConfiguration() {
        return new BeanConfiguration();
    }
}

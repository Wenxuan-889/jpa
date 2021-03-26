package wx0725.top;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import wx0725.top.config.EnvironmentConfig;
import wx0725.top.domain.*;

/**
 * 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class ApplicationTest {

    /**
     * 测试 ConfigurationProperties
     */
    @Autowired
    private ConfigurationProperticeMain configurationProoperticeMain;

    @Test
    public void configurationProoperticeTest() {
        System.out.println(configurationProoperticeMain);
    }

    /**
     * 测试Value
     */
    @Autowired
    private ValueMain valueMain;

    @Test
    public void ValueTest() {
        System.out.println(valueMain);
    }

    /**
     * 测试PropertySource
     */
    @Autowired
    private PropertySourceMain propertySourceMain;

    @Test
    public void PropertySourceTest() {
        System.out.println(propertySourceMain);
    }

    /**
     * 实体类上下文测试 Bean
     */
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void isBeanXML() {
        System.out.println(applicationContext.containsBean("BeanXML")); // 这里指的是ID
    }

    @Test
    public void isBeanConfiguration() {
        System.out.println(applicationContext.containsBean("beanConfiguration")); // 注意是小写，表示的方法，而不是类名
    }

    /**
     * Profile测试
     */
    @Autowired
    private EnvironmentConfig environmentConfig;

    @Test
    public void environmentConfigTest() {
        environmentConfig.configure();
    }

}

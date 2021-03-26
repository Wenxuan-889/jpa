package wx0725.top.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * PropertySource 定义类
 */
@Configuration // 表明 自定义配置类
@PropertySource("classpath:other.properties") // 指定自定义配置类
@EnableConfigurationProperties(PropertySourceMain.class)
@ConfigurationProperties(prefix = "wx0725") // 在这里只能读开头不能 wx0725.top
public class PropertySourceMain {

    private String topDescr; // 配置文件 top-descr 使用松散绑定

    @Override
    public String toString() {
        return "PropertySourceMain{" +
                "topDescr='" + topDescr + '\'' +
                '}';
    }

    public String getTopDescr() {
        return topDescr;
    }

    public void setTopDescr(String topDescr) {
        this.topDescr = topDescr;
    }
}

package wx0725.top.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.Email;

/**
 *  ConfigurationPropertiies 定义类
 *  批量注入实体属性
 *  需要set
 *  不支持 SpEL表达式
 *  支持：
 *      复杂数据类型注入
 *      松散绑定【驼峰再配置文件可使用 “-”、“_”代替】
 *      JSR303校验 @Validated（如 @Email 不合法：不是一个合法的电子邮件地址）
 */
@Component
@ConfigurationProperties(prefix = "wx0725.top")
@Validated
public class ConfigurationProperticeMain {

    private String title;

    private String ip;

    @Email
    private String email;

    @Override
    public String toString() {
        return "ConfigurationProoperticeMain{" +
                "title='" + title + '\'' +
                ", ip='" + ip + '\'' +
                ", author='" + email + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

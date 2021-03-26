package wx0725.top.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Value 定义类
 * 支持SqEL表达式
 * 需要逐个注入
 * 底层框架spring
 * 不需要set
 * 不支持：复杂数据类型属性注入、松散绑定、JSR303数据校验
 */
@Component
public class ValueMain {

    @Value("#{80}")
    private int port;

    @Value("${wx0725.top.title}")
    private String title;

    @Value("${wx0725.top.ip}")
    private String ip;

    @Value("${wx0725.top.email}")
    private String email;

    @Override
    public String toString() {
        return "ValueMain{" +
                "port=" + port +
                ", title='" + title + '\'' +
                ", ip='" + ip + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getPort() {
        return port;
    }

    public String getTitle() {
        return title;
    }

    public String getIp() {
        return ip;
    }

    public String getEmail() {
        return email;
    }
}

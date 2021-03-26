package wx0725.top;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;


/**
 * Spring Boot 启动类
 */
@ImportResource("classpath:beans.xml")
@SpringBootApplication
@MapperScan({"wx0725.top.mapper"})
public class ApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
    }
}


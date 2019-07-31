package com.eolinker;

import com.eolinker.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.eolinker.mapper")
@EnableConfigurationProperties(Config.class)
public class EolinkerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EolinkerServerApplication.class, args);
    }

}

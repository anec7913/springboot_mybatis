package anec.vip.studyspringboot04.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Druidconfi {

    //这个注解读取配置文件前缀为prefix的配置，将外部的配置文件与这里绑定
    @ConfigurationProperties(prefix = "spring.datasource")
    //容器的开启与关闭
    @Bean(initMethod = "init",destroyMethod = "close")
    public DruidDataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

}

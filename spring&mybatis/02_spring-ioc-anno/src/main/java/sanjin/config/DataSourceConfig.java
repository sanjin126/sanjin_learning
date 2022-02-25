package sanjin.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author sanjin
 * @date 2022/2/15 下午8:15
 * @description
 */
//<context:property-placeholder location="classpath:jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfig {
    @Value("${jdbc.driver}")
    private String DRIVER = "com.mysql.cj.jdbc.Driver" ;
    @Value("${jdbc.url}")
    private String URL = "jdbc:mysql://localhost:3306/qqzonedb2?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    @Value("${jdbc.user}")
    private String USER = "root";
    @Value("${jdbc.password}")
    private String PWD = "123" ;

    @Bean("dataSource")
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(DRIVER);
        dataSource.setUrl(URL);
        dataSource.setUsername(USER);
        dataSource.setPassword(PWD);
        return dataSource;
    }
}

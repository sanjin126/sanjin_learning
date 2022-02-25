package sanjin.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author sanjin
 * @date 2022/2/15 下午8:05
 * @description
 */
@Configuration
//<context:component-scan base-package="sanjin"></context:component-scan>
@ComponentScan("sanjin")
@Import({DataSourceConfig.class})
public class SpringConfig {


}

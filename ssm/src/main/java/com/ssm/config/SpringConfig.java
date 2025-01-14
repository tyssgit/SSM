package com.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// Spring配置类
@Configuration    // 标注配置
@ComponentScan("com.ssm.service")    // 组件扫描
@PropertySource("classpath:jdbc.properties")   // 属性配置文件位置
@Import({DataSourceConfig.class, MybatisConfig.class})    // 导入其他配置到spring配置
@EnableTransactionManagement  // 开启事务管理机制
public class SpringConfig {

}

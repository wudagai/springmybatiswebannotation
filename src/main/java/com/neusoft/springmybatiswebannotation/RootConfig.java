package com.neusoft.springmybatiswebannotation;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author: wudagai
 * @date: 2021/11/5 13:41
 * @description:
 */
@Configuration//标注该类为一个配置类,它可以被AbstractAnnotationConfigDispatcherServletInitializer所识别
//@ComponentScan用于扫描通用组件，这里用来扫描Service组件
@ComponentScan(basePackages = {"com.neusoft.springmybatiswebannotation.service.impl"})
//@MapperScan用于扫描Mapper组件
@MapperScan(basePackages="com.neusoft.springmybatiswebannotation.dao")
public class RootConfig {
    //创建dataSource组件并放入Spring容器
    @Bean  //标注该方法的返回实例管理进spring容器
    public DataSource dataSource()  {
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        dataSource.setUsername("scott");
        dataSource.setPassword("123");
        return dataSource;
    }

    //创建SqlSessionFactory组件并放入Spring容器
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setTypeAliasesPackage("com.neusoft.springmybatiswebannotation.pojo");

        Resource[] resources=new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml");
        sqlSessionFactoryBean.setMapperLocations(resources);

//        org.apache.ibatis.session.Configuration conn=new org.apache.ibatis.session.Configuration();
//        conn.setMapUnderscoreToCamelCase(true);
//        sqlSessionFactoryBean.setConfiguration(conn);
        return sqlSessionFactoryBean;
    }

    //创建PlatformTransactionManager组件并放入Spring容器
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){
        //dataSource也可以通过参数注入
        return  new DataSourceTransactionManager(dataSource());
    }


}

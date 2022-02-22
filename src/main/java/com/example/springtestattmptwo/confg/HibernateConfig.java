package com.example.springtestattmptwo.confg;


import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.example.springtestattmptwo"})
public class HibernateConfig {


    @Bean("sessionFactoryBean")
    public LocalSessionFactoryBean sessionFactoryBean()
    {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource());
        localSessionFactoryBean.setHibernateProperties(HibernateProps());
        localSessionFactoryBean.setPackagesToScan("com.example.springtestattmptwo");
        return localSessionFactoryBean;
    }

    @Bean("dataSource")
    public DataSource dataSource()
    {

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:postgresql://ec2-63-34-130-73.eu-west-1.compute.amazonaws.com:5432/denisnkks6mau4?sslmode=require");
        basicDataSource.setPassword("627ab846322f201fe778d597a914d61075401b8604b4468f0f92165bab6d4c87");
        basicDataSource.setUsername("dgvrjbcqytykii");
        basicDataSource.setDriverClassName("org.postgresql.Driver");
        return basicDataSource;
    }

    public Properties HibernateProps() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty("hibernate.show_sql","true");
        properties.setProperty("hibernate.format_sql","true");
        properties.setProperty("hibernate.hbm2ddl.auto","update");
        properties.setProperty("hibernate.connection.autocommit","true");
        return properties;
    }

    @Autowired
    @Bean
    public HibernateTransactionManager
    hibernateTransactionManager(@Qualifier("sessionFactoryBean") SessionFactory sessionFactory,
                                @Qualifier("dataSource") DataSource dataSource)
    {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(sessionFactory);
        hibernateTransactionManager.setDataSource(dataSource);
        return hibernateTransactionManager;

    }
}

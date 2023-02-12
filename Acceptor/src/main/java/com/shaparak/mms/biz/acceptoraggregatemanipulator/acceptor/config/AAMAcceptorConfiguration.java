package com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.repository",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.domain.repository",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.repository",
        },
        entityManagerFactoryRef = "aAMAcceptorEntityManagerFactory",
        transactionManagerRef = "aAMAcceptorTransactionManager")
public class AAMAcceptorConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.acceptor-aggregate-manipulator-ent-ds")
    public DataSourceProperties aAMAcceptorDataSourceProperties() {
        //spring.datasource.initialization-mode=always
        DataSourceProperties  dataSourceProperties =new DataSourceProperties();
//        dataSourceProperties.setInitializationMode(DataSourceInitializationMode.ALWAYS);
        return dataSourceProperties ;
    }

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.acceptor-aggregate-manipulator-ent-ds.hikari")
    public DataSource aAMAcceptorHikariDataSource() {
        HikariDataSource hikariDataSource = aAMAcceptorDataSourceProperties().initializeDataSourceBuilder()
                .type(HikariDataSource.class).build();
        return hikariDataSource;
    }

    @Primary
    @PersistenceContext(unitName = "aAMAcceptorEntityManagerPersistenceContextUnit")
    @Bean(name = "aAMAcceptorEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean aAMAcceptorEntityManagerFactory(EntityManagerFactoryBuilder entityManagerFactoryBuilder) {
        Map<String, Object> propertiesMap = new HashMap<>();
        propertiesMap.put("hibernate.database", "oracle");
        propertiesMap.put("hibernate.implicit_naming_strategy", "org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy");
        propertiesMap.put("hibernate.physical_naming_strategy", "org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");
        propertiesMap.put("hibernate.hbm2ddl.auto",  "update");
        propertiesMap.put("hibernate.default_schema", "TestFSM");
        propertiesMap.put("hibernate.dialect", "org.hibernate.dialect.Oracle12cDialect");
        propertiesMap.put("hibernate.transaction.jta.platform", "NoJtaPlatform");
//        propertiesMap.put("hibernate.temp.use_jdbc_metadata_defaults", "false");
//        propertiesMap.put("hibernate.jdbc.use_get_generated_keys", "true");
        propertiesMap.put("hibernate.temp.use_jdbc_metadata_defaults", "true");

        return entityManagerFactoryBuilder
                .dataSource(aAMAcceptorHikariDataSource())
                .packages("com.shaparak.mms.biz.terminalreqprocessor.fsm.domain.model",
                        "com.shaparak.mms.biz.terminalreqprocessor.fsm.web.resource.data")
                .properties(propertiesMap)
                .persistenceUnit("fsmSampleEntityManagerPersistenceContextUnit")
                .build();
    }

    @Primary
    @Bean(name = "aAMAcceptorTransactionManager")
    public PlatformTransactionManager aAMAcceptorTransactionManager(
            final @Qualifier("aAMAcceptorEntityManagerFactory") LocalContainerEntityManagerFactoryBean aAMAcceptorEntityManagerFactory) {
            return new JpaTransactionManager(aAMAcceptorEntityManagerFactory.getObject());
    }
}


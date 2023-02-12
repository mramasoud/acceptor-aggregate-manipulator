package com.shaparak.mms.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication(scanBasePackages = {
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.*",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.*",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.domain.model",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.domain.*"
})
@EntityScan(basePackages = {
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.domain.model",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model",
        "com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.domain.model"

})
@EnableEurekaClient
public class AAMAcceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AAMAcceptorApplication.class, args);

    }

}
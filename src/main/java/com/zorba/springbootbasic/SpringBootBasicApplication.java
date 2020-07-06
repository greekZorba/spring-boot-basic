package com.zorba.springbootbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ComponentScan 애노테이션으로 빈 읽어들이고 등록한 다음,
 * EnableAutoConfiguration 애노테이션으로 추가적으로 읽어들인 빈을 다시 등록한다.
 *
 * EnableAutoConfiguration
 * spring.factories에 있는 키값을 통해 빈들을 등록한다.
 * 빈들도 조건에 따라 생성될지 말지 결정됨
 * */
@SpringBootApplication
public class SpringBootBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicApplication.class, args);
    }

}

/*
 * Copyright 1999-2004 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.young.bolin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ��Application.java��ʵ��������Ӧ��������� ����http://localhost:8080/user/1���ɿ���ҳ�������һ��JSON��
 * 
 * <pre>
 * {"id":1,"name":"zhang"}
 * </pre>
 * @author yangbolin 23 Aug 2015 3:27:36 pm
 */
@Configuration  
@ComponentScan  
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        System.out.println("start boot...");
        SpringApplication.run(Application.class);
        System.out.println("end boot...");
    }
}

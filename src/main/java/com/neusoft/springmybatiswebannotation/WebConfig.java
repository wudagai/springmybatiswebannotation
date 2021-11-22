package com.neusoft.springmybatiswebannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author: wudagai
 * @date: 2021/11/5 14:09
 * @description:
 */
@Configuration//标注该类为一个配置类
//配置映射器和适配器 相当于<mvc:annotation-driven/>
@EnableWebMvc
//@ComponentScan用于扫描通用组件，这里用来扫描Contoller组件
@ComponentScan(basePackages = {"com.neusoft.springmybatiswebannotation.controller"})
public class WebConfig {
}

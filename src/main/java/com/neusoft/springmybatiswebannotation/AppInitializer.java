package com.neusoft.springmybatiswebannotation;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author: wudagai
 * @date: 2021/11/5 14:13
 * @description:
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 返回一个带有@Configuration注解的类。
     * 用来创建整个应用程序的全局Spring容器。
     * 也就是等同于创建applicationContext.xml容器
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }
    /**
     * 返回一个带有@Configuration注解的类。
     * 用来创建SpringMVC（即Web相关）的Spring容器。
     * 也就是等同于创建springmvc-servlet.xml容器
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }
    //配置SpringMVC前端控制器映射路径
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}

package com.jxd.emp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author:zff
 * @Description:Todo
 * @Date:2020/4/19
 */
@Configuration
public class CrosConfig implements WebMvcConfigurer {
    public void addCorsMappings(CorsRegistry registry){
        //  /**匹配的是我们所有的后台路径，代表后台共享了什么资源
        registry.addMapping("/**")
                //匹配的是前台的服务器地址
                .allowedOrigins("*")
                //允许的前台的请求方式
                .allowedMethods("GET","HEAD","POST","DELETE","OPTIONS")
                .allowCredentials(true)
                .maxAge(3600)
                .allowedHeaders("*");
    }
}

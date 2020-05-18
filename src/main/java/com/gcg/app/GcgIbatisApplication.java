package com.gcg.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages={"com.gcg.app"})
@EnableTransactionManagement
@MapperScan({"com.gcg.app.dao"})
@EnableSwagger2
//@ComponentScan({"com.gcg.app"})
public class GcgIbatisApplication extends SpringBootServletInitializer{

	
	public static void main(String[] args) {
		SpringApplication.run(GcgIbatisApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GcgIbatisApplication.class);
	}
	 @Bean
     public WebMvcConfigurer corsConfigurer() {
         return new WebMvcConfigurerAdapter() {
             @Override
             public void addCorsMappings(CorsRegistry registry) {
                 registry.addMapping("/api/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");


             }
         };
     }
}

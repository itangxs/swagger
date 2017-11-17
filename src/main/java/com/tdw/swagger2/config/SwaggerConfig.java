package com.tdw.swagger2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author tangxs
 * @date 2017/11/16
 */
@Configuration
public class SwaggerConfig {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("账户管理接口API文档")
                .apiInfo(apiInfo())
                .select()
                //配置了api文件也就是controller包的路径
                .apis(RequestHandlerSelectors.basePackage("com.tdw.swagger2.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("账户管理接口API文档")
                .description("账户管理接口API文档")
                .termsOfServiceUrl(" no terms of service")
                .version("version 1.0")
                //.contact(new Contact("tangxs", "/getJson", ""))
                .build();
    }
}
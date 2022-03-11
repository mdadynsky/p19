package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;


import java.nio.charset.StandardCharsets;

@Configuration
@EnableWebMvc
public class WebMvcConfiguration {

    @Bean
    public FreeMarkerViewResolver freemarkerViewResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setOrder(0);
        resolver.setSuffix(".ftl");
        resolver.setCacheUnresolved(false);
        resolver.setContentType(MediaType.TEXT_HTML_VALUE);

        return resolver;
    }

    @Bean
    public FreeMarkerConfigurer freemarkerConfig() {
        FreeMarkerConfigurer config = new FreeMarkerConfigurer();
        config.setDefaultEncoding(StandardCharsets.UTF_8.name());
        config.setTemplateLoaderPath("classpath:/templates/");
        return config;
    }
}

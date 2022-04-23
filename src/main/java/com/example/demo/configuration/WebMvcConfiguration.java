package com.example.demo.configuration;

import com.example.demo.resolver.MyLocaleResolver;
import freemarker.ext.jsp.TaglibFactory;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebMvc
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.setOrder(0);

        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/")
                .setCachePeriod(0);
    }

    @Bean
    public FreeMarkerViewResolver freemarkerViewResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setContentType("text/html;charset=utf-8");
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

    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceRequestEncoding(true);
        characterEncodingFilter.setForceRequestEncoding(true);
        return characterEncodingFilter;
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}

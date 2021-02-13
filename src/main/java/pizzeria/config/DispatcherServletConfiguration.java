/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import pizzeria.converter.StringToPaymentConverter;
import pizzeria.converter.StringToSizeConverter;

/**
 *
 * @author alkinoos
 */
@Configuration //this is a spring configuration class
@EnableWebMvc //Our application will contain Annotations in some classes. So take them into account.
@ComponentScan(basePackages = "pizzeria") //start scanning from base package emergon to find classes with Annotations
public class DispatcherServletConfiguration implements WebMvcConfigurer{
    
    //auta gia to addFormatters(converter package)
    @Autowired
    private StringToSizeConverter stringToSizeConverter;
    @Autowired
    private StringToPaymentConverter stringToPaymentConverter;

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        registry.viewResolver(viewResolver);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(stringToSizeConverter);
        registry.addConverter(stringToPaymentConverter);
        
    }
    
    
    
    
}

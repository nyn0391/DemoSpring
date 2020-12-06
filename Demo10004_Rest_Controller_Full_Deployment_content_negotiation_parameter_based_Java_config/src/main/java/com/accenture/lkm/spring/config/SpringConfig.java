
package com.accenture.lkm.spring.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration //makes the class declared as Spring configuration file..
@EnableWebMvc //<mvc:annotation-driven/> 
@ComponentScan(basePackages = "com.accenture")//<context:component-scan/>
//@PropertySource("classpath:mysql.properties")
public class SpringConfig extends WebMvcConfigurerAdapter{
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.favorPathExtension(false).
	    favorParameter(true).
	    parameterName("msd_mediaType").
	    ignoreAcceptHeader(true).
	    useJaf(false).
	    mediaType("xml", MediaType.APPLICATION_XML). 
	    mediaType("json", MediaType.APPLICATION_JSON).
	    mediaType("fool", MediaType.APPLICATION_JSON).
	    defaultContentType(MediaType.APPLICATION_XML);
		
	}
    
   
   
}
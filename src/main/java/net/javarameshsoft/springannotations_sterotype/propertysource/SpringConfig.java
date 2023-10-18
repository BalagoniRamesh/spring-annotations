package net.javarameshsoft.springannotations_sterotype.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:mail.properties") //add property source annotation to provide the custom property file to the spring environment, we can read property file the @annotation or environment class
//@PropertySource("classpath:messages.properties")
@PropertySources({
        @PropertySource("classpath:mail.properties"),
        @PropertySource("classpath:messages.properties")
})
public class SpringConfig {
}

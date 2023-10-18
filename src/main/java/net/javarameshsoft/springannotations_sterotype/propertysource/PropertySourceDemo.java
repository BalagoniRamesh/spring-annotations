package net.javarameshsoft.springannotations_sterotype.propertysource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class PropertySourceDemo {
    //let's get this spring bean(PropertySourceDemo) from the spring IOC container and then will call it getter methods
    //case-2: environment class to read the property file
    @Autowired
    private Environment environment;


    //case-1: @value annotation to read the property
//    @Value("${gmail.host}") //pass property key
    private String host;
    //    @Value("${gmail.mail}")
    private  String mail;
    //    @Value("${gmail.password}")
    private String password;


    //    @Value("${app.name}")
    private  String appName;
    //    @Value("${app.description}")
    private  String appDesc;


    //creating getter methods to get values
    public String getHost() {
        return environment.getProperty("gmail.host");
        //environment object it has getProperty() method then pass property key
    }


    public String getMail() {
        return environment.getProperty("gmail.mail");
    }


    public String getPassword() {
        return environment.getProperty("gmail.password");
    }


    public String getAppName() {
        return environment.getProperty("app.name");
    }


    public String getAppDesc() {
        return environment.getProperty("app.description");
    }
}



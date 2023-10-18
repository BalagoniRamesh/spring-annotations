package net.javarameshsoft.springannotations_sterotype.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {
    //case-1: Assign default values to variables & methods
    @Value("Default Name")
    public String defaultName;
    //case-2: Read a value for property keys  from the application.properties(Real time project we use more this)
    @Value("${mail.host}")  //passing key we get value
    private  String host;
    @Value("${mail.email}")
    private String email;
    @Value("${mail.password}")
    private String password;
    //case-3: read the environment variable & system variables, by default spring boot load environment variable & system variables
    @Value("${java.home}") //key will provide a value has a complete java home path, this will give system variable for a java home
    private String javaHome;
    @Value("${HOME}") //this will give the current home directory
    private String homeDir;
    public String getDefaultName() {
        return defaultName;
    }

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public String getHomeDir() {
        return homeDir;
    }
}

package net.javarameshsoft.springannotations_sterotype.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)  //if you don't specify the scope explicitly using @Scope Annotation then by default spring will provide Singleton scope for ths bean
public class SingleTonBean {
    public  SingleTonBean(){
        System.out.println("SingleTonBean..");
    }
}

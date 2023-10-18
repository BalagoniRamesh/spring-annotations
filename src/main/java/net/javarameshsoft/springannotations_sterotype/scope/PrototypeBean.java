package net.javarameshsoft.springannotations_sterotype.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //pass scope type, use value attribute, pass hardcoded value
public class PrototypeBean {
    public  PrototypeBean(){
        System.out.println("PrototypeBean..");
    }
}

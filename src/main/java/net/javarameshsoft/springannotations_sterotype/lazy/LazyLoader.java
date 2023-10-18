package net.javarameshsoft.springannotations_sterotype.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //this annotation tells spring container to load the spring bin for this class on demand
public class LazyLoader {
    public LazyLoader(){
        System.out.println("LazyLoader ..");
    }
}

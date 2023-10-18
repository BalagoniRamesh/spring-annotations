package net.javarameshsoft.springannotations_sterotype;

import net.javarameshsoft.springannotations_sterotype.controller.PizzaController;
import net.javarameshsoft.springannotations_sterotype.service.VegPizza;
import net.javarameshsoft.springannotations_sterotype.controller.MyController;
import net.javarameshsoft.springannotations_sterotype.controller.MyService;
import net.javarameshsoft.springannotations_sterotype.lazy.LazyLoader;
import net.javarameshsoft.springannotations_sterotype.propertysource.PropertySourceDemo;
import net.javarameshsoft.springannotations_sterotype.repository.MyRepository;
import net.javarameshsoft.springannotations_sterotype.scope.PrototypeBean;
import net.javarameshsoft.springannotations_sterotype.scope.SingleTonBean;
import net.javarameshsoft.springannotations_sterotype.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
	//	var context : ConfigurableApplicationContext  = SpringApplication.run(SpringAnnotationsApplication.class, args);
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
//		SingleTonBean singleTonBean1 = context.getBean(SingleTonBean.class);
//		System.out.println(singleTonBean1.hashCode());
//
//		SingleTonBean singleTonBean2 = context.getBean(SingleTonBean.class);
//		System.out.println(singleTonBean2.hashCode());
//
//		SingleTonBean singleTonBean3 = context.getBean(SingleTonBean.class);
//		System.out.println(singleTonBean3.hashCode());
//
//		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean1.hashCode());
//
//		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean2.hashCode());
//
//		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean3.hashCode());
//
//		System.out.println("\n@Value Annotation outputs: ");
//		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
//		//Assign default values to variables & methods
//		System.out.println(valueAnnotationDemo.getDefaultName());
//		//Read a value for property keys  from the application.properties
//		System.out.println(valueAnnotationDemo.getHost());
//		System.out.println(valueAnnotationDemo.getEmail());
//		System.out.println(valueAnnotationDemo.getPassword());
//		//read the environment variable & system variables
//		System.out.println(valueAnnotationDemo.getJavaHome());
//		System.out.println(valueAnnotationDemo.getHomeDir());

		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getMail());
		System.out.println(propertySourceDemo.getPassword());
		System.out.println(propertySourceDemo.getAppName());
		System.out.println(propertySourceDemo.getAppDesc());
	}
}
/*
o/p:
EagerLoader ..
SingleTonBean..
Initialization Logic
2023-09-20T15:20:43.020+05:30  INFO 48517 --- [           main] n.j.s.SpringAnnotationsApplication       : Started SpringAnnotationsApplication in 0.675 seconds (process running for 0.879)
gmail.com
rameshbalagoni128@gmail.com
secret
Spring Boot App
Spring Boot App Description
Destruction Logic
*/

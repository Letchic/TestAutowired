package com.letchick;

import com.letchick.bean.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class SpringBootStarter {
    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = SpringApplication.run(SpringBootStarter.class, args);

        Car ladaKalina = (Car)context.getBean("ladaKalina");
        System.out.println(ladaKalina);
        ladaKalina.getEngine().drive();

        Car cayene = (Car)context.getBean("cayene");
        System.out.println(cayene);
        cayene.getEngine().drive();

        Car hammer = (Car)context.getBean("hammer");
        System.out.println(hammer);
        hammer.getEngine().drive();
    }
}

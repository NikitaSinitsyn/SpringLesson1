package Application;

import Configuration.AppConfiguration;
import Pojo.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        Map<String, Driver> drivers = context.getBeansOfType(Driver.class);
        for (Map.Entry<String, Driver> entry : drivers.entrySet()) {
            System.out.println("Bean name: " + entry.getKey());
            System.out.println("Driver: " + entry.getValue());
            System.out.println();
        }

    }
}

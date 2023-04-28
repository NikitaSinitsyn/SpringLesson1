package Configuration;

import Pojo.Bus;
import Pojo.Car;
import Pojo.Driver;
import Pojo.Pickup;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public Car car() {
        Car car = new Car("BMW");
        System.out.println("Car готов к работе");
        return car;
    }

    @Bean
    public Bus bus() {
        Bus bus = new Bus("Volvo");
        System.out.println("Bus готов к работе");
        return bus;
    }

    @Bean
    public Pickup pickup() {
        Pickup pickup = new Pickup("Dodge");
        System.out.println("Pickup готов к работе");
        return pickup;
    }

    @Bean
    public Driver carDriver() {
        Driver driver = new Driver("Nikita", car());
        System.out.println("Car driver готов к работе");
        return driver;
    }
    @Bean
    public Driver busDriver() {
        Driver driver = new Driver("Victor", bus());
        System.out.println("Bus driver готов к работе");
        return driver;
    }

    @Bean
    public Driver pickupDriver() {
        Driver driver = new Driver("Vitaly", pickup());
        System.out.println("Pickup driver готов к работе");
        return driver;
    }

}

package configuration;

import beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

    /*@Bean(value = "audi")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("audi");
        return veh;
    }

    @Primary
    @Bean(value = "range rover")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("range rover");
        return veh;
    }

    @Bean(value = "bmw")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("bmw");
        return veh;
    }*/
}

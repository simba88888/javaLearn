package learning.j2ee.control;


import learning.j2ee.entity.Car;
import learning.j2ee.entity.Specification;

import java.util.UUID;

public class CarFactory {
    public Car createCar(Specification specification){
        Car car = new Car();
        car.setIdentifier(UUID.randomUUID().toString());
        car.setColor(specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }
}

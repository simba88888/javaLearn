package learning.j2ee.boundary;

import learning.j2ee.control.CarFactory;
import learning.j2ee.control.CarRepository;
import learning.j2ee.entity.Car;
import learning.j2ee.entity.Specification;

public class CarManufacturer {
    // common usage
    private final CarFactory carFactory = new CarFactory();
    private final CarRepository carRespository = new CarRepository();

    public Car manufactureCar(Specification specification){
        Car car = carFactory.createCar(specification);
        //store database
        carRespository.store(car);
        return car;
    }

}

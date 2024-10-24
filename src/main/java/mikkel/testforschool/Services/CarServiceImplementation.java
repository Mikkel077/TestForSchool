package mikkel.testforschool.Services;

import mikkel.testforschool.Models.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImplementation {
    private  CarService carService;

    public CarServiceImplementation(CarService carService) {
        this.carService = carService;
    }

    public Optional<Car> getCarById(Long id) {
        return carService.findById(id);
    }

    public List<Car> getAllCars() {
        return carService.findAll();
    }
}

package mikkel.testforschool.Controller;


import mikkel.testforschool.Models.Car;
import mikkel.testforschool.Services.CarServiceImplementation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {
    private CarServiceImplementation carServiceToUse;


    public CarController(CarServiceImplementation carServiceToUse) {
        this.carServiceToUse = carServiceToUse;
    }

    @GetMapping("cars/{id}")
    public ResponseEntity<Optional<Car>> getCarById(@PathVariable Long id) {
        Optional<Car> carToReturn = carServiceToUse.getCarById(id);
        return ResponseEntity.ok(carToReturn);
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> carsToReturn = carServiceToUse.getAllCars();
        return ResponseEntity.ok(carsToReturn);
    }


}

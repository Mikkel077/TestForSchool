package mikkel.testforschool.Services;

import mikkel.testforschool.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarService extends JpaRepository<Car, Long> {
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarParkTest {

    CarPark carPark;

    @BeforeEach
    public void setUp(){
        carPark = new CarPark();
    }

    @Test
    public void canGetNumberOfVehicles(){
        assertThat(carPark.getNumberOfVehicles()).isEqualTo(0);
    }

    @Test
    public void canAddVehicle(){
        Car car = new Car(4, 5, "diesel", true);
        Motorbike motorbike = new Motorbike(2, 2, "petrol", "moped");
        carPark.addVehicle(car);
        assertThat(carPark.getNumberOfVehicles()).isEqualTo(1);
    }


}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    public void setUp(){
        car = new Car (4, 5, "diesel", true);
    }

    @Test
    public void canGetNumberOfWheels(){
        assertThat(car.getNumberOfWheels()).isEqualTo(4);
    }

    @Test
    public void canGetMaximumOccupancy(){
        assertThat(car.getMaximumOccupancy()).isEqualTo(5);
    }

    @Test
    public void canGetFuelType(){
        assertThat(car.getFuelType()).isEqualTo("diesel");
    }

    @Test
    public void isCarManual(){
        assertThat (car.isManual()).isEqualTo(true);
    }
}

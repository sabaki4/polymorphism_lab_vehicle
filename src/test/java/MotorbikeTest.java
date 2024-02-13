import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorbikeTest {

    Motorbike motorbike;

    @BeforeEach
    public void setUp(){
        motorbike = new Motorbike (2, 2, "petrol", "moped");
    }

    @Test
    public void canGetNumberOfWheels(){
        assertThat(motorbike.getNumberOfWheels()).isEqualTo(2);
    }

    @Test
    public void canGetMaximumOccupancy(){
        assertThat(motorbike.getMaximumOccupancy()).isEqualTo(2);
    }

    @Test
    public void canGetFuelType(){
        assertThat(motorbike.getFuelType()).isEqualTo("petrol");
    }

    @Test
    public void canGetType(){
        assertThat (motorbike.getType()).isEqualTo("moped");
    }
}

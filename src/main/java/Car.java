public class Car extends Vehicle {

    private boolean isManual;

    public Car(int numberOfWheels, int maximumOccupancy, String fuelType, boolean isManual){
        super(numberOfWheels, maximumOccupancy, fuelType);
        this.isManual = true;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }
}

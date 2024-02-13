public class Motorbike extends Vehicle {

    private String type;

    public Motorbike(int numberOfWheels, int maximumOccupancy, String fuelType, String type){
        super(numberOfWheels, maximumOccupancy, fuelType);
        this.type = type;
    }

    public String type (){
        return type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

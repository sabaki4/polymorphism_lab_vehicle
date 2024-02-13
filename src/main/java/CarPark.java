import java.util.ArrayList;

public class CarPark {

    private ArrayList<Vehicle> vehicles;



    public CarPark(){
        this.vehicles = new ArrayList<>();
    }


    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int getNumberOfVehicles() {
        return vehicles.size();
    }

}

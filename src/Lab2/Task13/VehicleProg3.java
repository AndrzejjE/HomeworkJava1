package Lab2.Task13;

class Vehicle {
    private int passengers;
    private int fuelcap;
    private double lkm;
    private String type;

    public Vehicle(String type, int passengers, int fuelcap, double lkm) {
        setVeh(type, passengers, fuelcap, lkm);
    }
    public Vehicle(){
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public double getLkm() {
        return lkm;
    }

    public void setLkm(double lkm) {
        this.lkm = lkm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVeh(String type, int passengers, int fuelcap, double lkm){
        this.setPassengers(passengers);
        this.setFuelcap(fuelcap);
        this.setLkm(lkm);
        this.setType(type);
    }
    public void range(){
        System.out.println(getType() + "przwozi " + getPassengers() + " osób na odległość do " + (int) (getFuelcap() / getLkm() * 100) + " kilometrów");
    }

}

public class VehicleProg3 {
    public static void main(String[] args){
        Vehicle miniVan = new Vehicle( "Minivan ", 7,70,10.7);
        Vehicle sportsCar = new Vehicle("Auto sportowe ",2,74,17);

        miniVan.range();
        sportsCar.range();
    }
}

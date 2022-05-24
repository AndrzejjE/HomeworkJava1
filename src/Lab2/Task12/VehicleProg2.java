package Lab2.Task12;

class Vehicle {
    private int passengers;
    private int fuelcap;
    private double lkm;

    public Vehicle(int passengers, int fuelcap, double lkm) {
        setVeh(passengers, fuelcap, lkm);
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
    public void setVeh(int passengers, int fuelcap, double lkm){
        this.setPassengers(passengers);
        this.setFuelcap(fuelcap);
        this.setLkm(lkm);
    }
    public int range(){
        return (int) (getFuelcap() / getLkm() * 100);
    }

}
public class VehicleProg2 {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(7,70,10.7);
        Vehicle sportsCar = new Vehicle(2,74,17);

        System.out.println("Minivan przewozi " + miniVan.getPassengers() + " osób.\n" + "Zasięg (km): " + miniVan.range());
        System.out.println("Sportowe auto przewozi " + sportsCar.getPassengers() + " osoby.\n" + "Zasięg (km): " + sportsCar.range());
    }
}

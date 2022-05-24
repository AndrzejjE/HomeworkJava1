package Lab2.Task11;

class Vehicle {
    int passengers;
    int fuelcap;
    double lkm;
}
public class VehicleProg {

    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle();
        Vehicle sportsCar = new Vehicle();
        int rangeMiniVan, rangeSportsCar;
        miniVan.passengers = 7;
        miniVan.fuelcap = 70;
        miniVan.lkm =10.7;

        rangeMiniVan = (int) (miniVan.fuelcap / miniVan.lkm * 100);

        sportsCar.passengers = 2;
        sportsCar.fuelcap = 74;
        sportsCar.lkm = 17;

        rangeSportsCar = (int) (sportsCar.fuelcap / sportsCar.lkm * 100);
        System.out.println("Minivan przewozi " + miniVan.passengers + " osób na odległość do " +
                rangeMiniVan + " kilometrów.");
        System.out.println("Auto sportowe przewozi " + sportsCar.passengers + " osoby na odległość do " +
                rangeSportsCar + " kilometrów.");

    }
}

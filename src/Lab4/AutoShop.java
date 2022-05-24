package Lab4;


class Car {
     int speed;
     double regularPrice;
     String color;

    public double getSalePrice() {
        return regularPrice;
    }
}
class Sedan extends Car implements Purchase {
    int length;

    public void setSedan(int speed, double regularPrice, String color, int length) {
        this.length = length;
        super.color = color;
        super.regularPrice = regularPrice;
        super.speed = speed;
    }

//    public Sedan(int speed, double regularPrice, String color) {
//        super();
//    }
    public Sedan(){
    }

    public double getSalePrice() {
        if (length > 20){
            return super.getSalePrice() * 0.95;
        }else return super.getSalePrice() * 0.90;
    }

    @Override
    public String getPurchaseInfo() {
        return "SEDAN: ";
    }
}


class Ford extends Sedan implements Purchase {
    int year;
    int manufacturerDiscount;

    public void setFord(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        //super(speed,regularPrice,color);
        super.speed = speed;
        super.regularPrice = regularPrice;
        super.color = color;
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    public Ford(){}

//    public Ford(int speed, double regularPrice, String color) {
//        super(speed,regularPrice,color);
//    }

    public double getSalePrice() {
        return super.regularPrice - manufacturerDiscount;
    }

    @Override
    public String getPurchaseInfo() {
        return "FORD: ";
    }
}
class Truck extends Ford implements Purchase {
    int weight;

    public void setTruck(int speed, double regularPrice, String color, int weight) {
        //super(speed, regularPrice, color);
        super.speed = speed;
        super.regularPrice = regularPrice;
        super.color = color;
        this.weight = weight;
    }
    public Truck(){}

    public double getSalePrice() {
        if (weight > 2000){
            return super.getSalePrice() * 0.90;
        }else return super.getSalePrice();
    }

    @Override
    public String getPurchaseInfo() {
        return "TRUCK: ";
    }
}
interface Purchase {
    String getPurchaseInfo();
}


public class AutoShop {
    public static void main(String[] args){
       /* Sedan sedan = new Sedan();
        sedan.speed = 160;
        sedan.regularPrice = 20000;
        sedan.color = "red";
        sedan.length = 10;

        Ford ford1 = new Ford();
        ford1.speed = 156;
        ford1.regularPrice = 4452.0;
        ford1.color = "black";
        ford1.year = 2005;
        ford1.manufacturerDiscount = 10;

        Ford ford2 = new Ford();
        ford2.speed = 155;
        ford2.regularPrice = 5000.0;
        ford2.color = "pink";
        ford2.year = 1998;
        ford2.manufacturerDiscount = 5;

        Truck truck = new Truck();
        truck.speed = 200;
        truck.regularPrice = 500000;
        truck.color = "gold";
        truck.weight = 5000;*/

       /* System.out.println(sedan.getPurchaseInfo() + sedan.getSalePrice());
        System.out.println(ford1.getPurchaseInfo() + ford1.getSalePrice());
        System.out.println(ford2.getPurchaseInfo() + ford2.getSalePrice());
        System.out.println(truck.getPurchaseInfo() + truck.getSalePrice());
*/

        Sedan sedan = new Sedan();
        sedan.setSedan(160,20000,"red",10);
        System.out.println(sedan.getPurchaseInfo() + sedan.getSalePrice());

        Ford ford1 = new Ford();
        ford1.setFord(156,4452.0,"black",2005,10);
        System.out.println(ford1.getPurchaseInfo() + ford1.getSalePrice());

        Ford ford2 = new Ford();
        ford2.setFord(155,5000.0,"pink",1998,5);
        System.out.println(ford2.getPurchaseInfo() + ford2.getSalePrice());

        Truck truck = new Truck();
        truck.setTruck(200,500000,"gold",5000);
        System.out.println(truck.getPurchaseInfo() + truck.getSalePrice());




    }
}

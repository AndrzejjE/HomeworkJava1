package Lab2.Task14;

import java.util.Scanner;

class evenOrOdd{
    Scanner scanner = new Scanner(System.in);
    public void evenOrOdd(){
        System.out.println("Podaj dowolną liczbę:");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " jest parzysta");
        }else System.out.println(number + " jest nieparzysta");
    }

}
public class zad {
    public static void main(String[] args){
        evenOrOdd x = new evenOrOdd();
        x.evenOrOdd();
    }
}
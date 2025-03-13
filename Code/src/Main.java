import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price = 40.0;
        double discount = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age :");
        int age = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Residence :");
        String residence = sc1.next();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter day :");
        String day = sc2.next();


            if (age < 10) {
                price = 0;
            }
            else if (age < 18) {
                discount += 0.5;
            }
            if (residence.equals( "Warsaw")){
                discount += 0.1;
            }
            if (day.equals("Thursday")){
                price = 0;
            }

            System.out.println("Data: " + residence + ", " + age + " years old, " + day + " ticket price: " + (price * discount) + " PLN ");
            System.out.println("Discount :" + discount + "%");
    }
}
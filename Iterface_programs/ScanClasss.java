package Iterface_programs;
import java.util.Scanner;
public class ScanClasss {
    Scanner sc = new Scanner(System.in);

    void add() {
        System.out.println("Enter the x value...");
        int x = sc.nextInt();
        System.out.println("Enter the y value...");
        int y = sc.nextInt();
        System.out.println("The sum of value is " + (x + y));
    }

    void sub() {
        System.out.println("Enter the x value...");
        int x = sc.nextInt();
        System.out.println("Enter the y value...");
        int y = sc.nextInt();
        System.out.println("The sum of value is " + (x - y));
    }

    void mul() {
        System.out.println("Enter the x value...");
        int x = sc.nextInt();
        System.out.println("Enter the y value...");
        int y = sc.nextInt();
        System.out.println("The sum of value is " + (x * y));
    }

    void div() {
        System.out.println("Enter the x value...");
        int x = sc.nextInt();
        System.out.println("Enter the y value...");
        int y = sc.nextInt();
        System.out.println("The sum of value is " + (x / y));
    }

    public static void main(String[] args) {
     for (int i = 1; i <= 100; i++) {
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the input");
        System.out.println("1.add");
        System.out.println("2.sub");
        System.out.println("3.mul");
        System.out.println("4.div");
       
            int input = s2.nextInt();
            ScanClasss cl = new ScanClasss();
            switch (input) {
                case 1: cl.add();
                       break;
                case 2: cl.sub();
                       break;
                case 3: cl.mul();
                       break;
                case 4: cl.div();
                       break;
                default: System.out.println("Invalid input");
            }
        }
    }
}



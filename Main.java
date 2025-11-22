import java.util.Scanner;

public class Main {

    public static double addition(double a, double b){
        return a+b;
    }
    //testing again
    public static double subtraction(double a, double b){
        return a-b;
    }
    public static double multiplication(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        if (b==0){
            System.out.println("Division by Zero is not allowed");
        }
        return a/b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter choice (1-5): ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Closing calculator. Thanks!");
                flag = false;
                break;
            }
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = addition(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = subtraction(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = multiplication(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = division(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }

        sc.close();
    }
}

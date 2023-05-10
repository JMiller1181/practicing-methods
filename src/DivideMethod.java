import java.util.Scanner;
public class DivideMethod {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();
        divide(a,b);
    }
    public static void divide (int first, int second) {
        double result = (double) first / (double) second;
        System.out.println(first + " / " + second + " = " + result);
    }
}

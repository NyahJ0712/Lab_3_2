import java.util.Scanner;

public class GCDDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int temp;
        do {
            temp = b;
            b = a % b;
            a = temp;
        } while (b != 0);

        System.out.println("GCD is " + a);
        input.close();
    }
}

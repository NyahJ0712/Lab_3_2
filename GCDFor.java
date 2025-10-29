import java.util.Scanner;

public class GCDFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int temp;
        // Using for loop to simulate while(b != 0)
        for (; b != 0; ) {
            temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD is " + a);
        input.close();
    }
}

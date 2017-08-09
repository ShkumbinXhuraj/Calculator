import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two Values to Calculate");
        System.out.print("Enter the X : ");
        int x = input.nextInt();

        System.out.print("Enter the Y : ");
        int y = input.nextInt();

        System.out.println("The value of both Variables is : " + (x + y));

    }
}


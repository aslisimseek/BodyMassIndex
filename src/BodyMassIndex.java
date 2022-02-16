import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Your Length..:");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Please Enter Your Weight..:");
        double weight = Double.parseDouble(scanner.nextLine());

        double calculatedBMI = weight / (length * length);

        System.out.print("Your Body Mass Index..:" + calculatedBMI);
    }
}

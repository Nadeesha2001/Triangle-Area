import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in);

        System.out.println("Enter Stand Lenght");
        Double stand = Values.nextDouble();
        System.out.println("Enter Direct high");
        Double direct_high = Values.nextDouble();

        Double Area = 0.5 * stand * direct_high;
        System.out.println("Your Triangle Area is" + " " + Area);

    }
}

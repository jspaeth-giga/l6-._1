import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double celsiusTemperature = 0;
        double degreesFarenheit;
        boolean validTemp = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("what is the temperature in celsius?");
            if (scan.hasNextDouble()) {
                celsiusTemperature = scan.nextDouble();
                validTemp = true;
            } else {
                System.out.println("you have entered an invalid integer");
            }
            scan.nextLine();
        }while (!validTemp);

        degreesFarenheit = (celsiusTemperature * 1.8) + 32;
        System.out.printf("%-15s %10.2f", "Degrees C:", + celsiusTemperature);
        System.out.printf("\n%-15s %10.2f", "Degrees F:", + degreesFarenheit);
        }
    }
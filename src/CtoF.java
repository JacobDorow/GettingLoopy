import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args) {
        double celciusTemp;
        double convertedCToF;
        boolean keepGoing = true;

        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Please enter the degrees in Celsius: ");

            if (input.hasNextDouble()) {
                celciusTemp = input.nextDouble();
                convertedCToF = (celciusTemp * 9 / 5) + 32;
                System.out.println(convertedCToF + " Fahrenheit!");
                keepGoing = false;
            } else {
                System.out.println("Bad input. Try again");
                input.nextLine();
                continue;
            }
        }
        while (keepGoing);
    }

}
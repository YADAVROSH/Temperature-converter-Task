import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature value:");
        double temp = sc.nextDouble();

        System.out.println("Convert from (C/F/K):");
        char from = sc.next().toUpperCase().charAt(0);

        System.out.println("Convert to (C/F/K):");
        char to = sc.next().toUpperCase().charAt(0);

        double result = convertTemperature(temp, from, to);
        System.out.printf("Converted temperature: %.2f %c\n", result, to);
    }

    static double convertTemperature(double temp, char from, char to) {
        if (from == to)
            return temp;

        double celsius;

        if (from == 'C')
            celsius = temp;
        else if (from == 'F')
            celsius = (temp - 32) * 5 / 9;
        else
            celsius = temp - 273.15;

        if (to == 'C')
            return celsius;
        else if (to == 'F')
            return (celsius * 9 / 5) + 32;
        else
            return celsius + 273.15;
    }
}

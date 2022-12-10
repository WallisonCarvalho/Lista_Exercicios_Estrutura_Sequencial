import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double grausFahrenheit = sc.nextDouble();
        sc.close();

        double grausCelsius = 5 * ((grausFahrenheit - 32) / 9);
        System.out.printf("A temperatura em graus Celsius é: %.2f", grausCelsius);

    }
}

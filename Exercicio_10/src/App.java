import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();
        sc.close();

        double grausFahrenheit = (celsius * 1.8) + 32;
        System.out.printf("A temperatura em graus Celsius é: %.2f", grausFahrenheit);

    }
}

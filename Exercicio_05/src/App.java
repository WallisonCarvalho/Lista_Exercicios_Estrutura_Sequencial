import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros para transformar em centímetros!");
        double metros = sc.nextDouble();
        sc.close();

        double centimetros = metros * 100;
        System.out.printf("A transformação de: " + metros + " metros para centímetros é: %.2f", centimetros);

    }
}

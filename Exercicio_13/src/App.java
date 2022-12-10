import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número Inteiro: ");
        double altura = sc.nextDouble();
        System.out.print("Qual o seu Sexo? [M] ou [H]: ");
        String sexo = sc.next();
        sc.close();

        if (sexo == "m" || sexo == "M") {
            double pesoIdeal = (62.1 * altura) - 44.7;

            System.out.printf("Peso ideal: %.2f", pesoIdeal);
        } else {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Peso ideal:  %.2f", pesoIdeal);
        }

    }
}

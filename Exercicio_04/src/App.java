import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota01 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota02 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota03 = sc.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota04 = sc.nextDouble();
        sc.close();

        double media = (nota01 + nota02 + nota03 + nota04) / 4;

        System.out.printf("A média das notas é: %.2f", media);
    }
}

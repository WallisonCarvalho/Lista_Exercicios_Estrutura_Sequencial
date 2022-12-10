import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dos lados do quadrado: ");
        double ladoQuadrado = sc.nextDouble();
        sc.close();

        double areaQuadrado = ladoQuadrado * ladoQuadrado * 2;

        System.out.printf("O dobro da área informado do quadrado é: %.2f", areaQuadrado);

    }
}

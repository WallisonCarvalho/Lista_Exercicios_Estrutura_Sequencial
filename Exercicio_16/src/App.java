import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de metros quadrados: ");
        double metrosQuandrado = sc.nextDouble();
        sc.close();

        double quantidadeLitros = metrosQuandrado / 3;

        double quantidadeLata = quantidadeLitros / 18;
        double precoUnitarioLitro = 4.4444444444444444;
        double precoTotal = quantidadeLitros * precoUnitarioLitro;

        System.out.println("--------------------INFORMAÇÔES---------------------------");
        System.out.printf("A quantidades de latas de tinta a serem compradas em lata é: %.2f", quantidadeLata);
        System.out.println(" ");
        System.out.printf("Preço total: R$ %.2f", precoTotal);


    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de metros quadrados: ");
        double metrosQuandrado = sc.nextDouble();
        sc.close();

        double quantidadeLitros = metrosQuandrado / 6;

        //Lata
        double quantidadeLata = quantidadeLitros / 18;
        double precoUnitarioLitro = 4.4444444444444444;
        double precoTotal = quantidadeLitros * precoUnitarioLitro;

        //Galão
        double quantidadeGalao = metrosQuandrado / 3.6;
        double precoUnitarioLitroGalao = 6.944444444444444;
        double precoTotalGalao = quantidadeGalao * precoUnitarioLitroGalao;

        double desconto = precoTotalGalao / 10;
        double resultadoDesconto = precoTotalGalao - desconto;

        System.out.println("--------------------INFORMAÇÔES---------------------------");


        System.out.println("Comprar apenas latas de 18 litros");        
        System.out.printf("A quantidades de latas de tinta a serem compradas em lata é: %.2f", quantidadeLata);
        System.out.println(" ");
        System.out.printf("Preço total: R$ %.2f", precoTotal);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------");
        System.out.println("Comprar apenas galões de 3,6 litros");        
        System.out.printf("A quantidades de latas de tinta a serem compradas em lata é: %.2f", quantidadeGalao);
        System.out.println(" ");
        System.out.printf("Preço total: R$ %.2f", precoTotalGalao);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------");
        System.out.println("Se Optar por misturar latas e galão");        
        System.out.printf("Preço total: R$ %.2f", resultadoDesconto);

    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os quilos de peixe pescado: ");
        double pesoPeixe = sc.nextDouble();
        sc.close();

        double kgPeixeEstabelecidoSP = 50.00;
        System.out.println("--------------------INFORMAÇÔES---------------------------");

        if (pesoPeixe > kgPeixeEstabelecidoSP) {
            double multa = (pesoPeixe - kgPeixeEstabelecidoSP) * 4;
            System.out.println("Peso regulamentado pelo estado de São Paulo (50 quilos).");
            System.out.printf("Peso dos peixes: Kg %.2f", pesoPeixe);
            System.out.println("");
            System.out.printf("Multa sobre o peso excedido: R$ %.2f", multa);
        }

    }
}

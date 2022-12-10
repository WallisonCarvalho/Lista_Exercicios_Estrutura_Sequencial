import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        int qtdeHoras = sc.nextInt();
        sc.close();

        double valortotal = qtdeHoras * valorHora;
        double impostoRenda = valortotal / 11;
        double INSS = valortotal / 8;
        double sindicato = valorHora / 5;

        double valorLiquido = valortotal - impostoRenda - INSS - sindicato;

        System.out.println("--------------------INFORMAÇÔES---------------------------");
        System.out.println("Salário bruto: R$ " + valortotal);
        System.out.printf("IR: R$ %.2f", impostoRenda);
        System.out.println(" ");
        System.out.printf("INSS: R$ %.2f", INSS);
        System.out.println(" ");
        System.out.printf("Sindicato: R$ %.2f", sindicato);
        System.out.println(" ");
        System.out.printf("Salário Liquido: R$ %.2f", valorLiquido);

    }
}

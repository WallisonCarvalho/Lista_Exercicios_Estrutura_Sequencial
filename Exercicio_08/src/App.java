import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora? ");
        double valorHora = sc.nextDouble();
        System.out.println("Qual o número de horas trabalhadas no mês? ");
        double qtdeHorasMes = sc.nextDouble();
        sc.close();

        double salario = valorHora * qtdeHorasMes;
        System.out.printf("Total do seu salário no referido mês é: R$ %.2f",  salario);

    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo para donwload (em MB): ");
        double arquivo = sc.nextDouble();
        System.out.print("Informe a velocidade de sua internet (em MBPS): ");
        double velocidade = sc.nextDouble();

        double tempo = arquivo / velocidade;
        double minuto = tempo / 60.0;

        System.out.printf("O tempo aproximado para download do arquivo usando este link em minutos é: %.2f", minuto);
        sc.close();
      
    }
}

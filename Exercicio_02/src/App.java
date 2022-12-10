import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = sc.nextDouble();
        sc.close();

        System.out.println("O número digitado foi: " + n1);
    }
}

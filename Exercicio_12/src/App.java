import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

       double pesoIdeal = (72.7*altura) - 58;

        System.out.printf("Peso ideal: %.2f", pesoIdeal);
        
    }
}

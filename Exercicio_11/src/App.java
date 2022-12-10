import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número Inteiro: ");
        int n1Int = sc.nextInt();
         System.out.print("Digite um segundo número Inteiro: ");
        int n2Int = sc.nextInt();
         System.out.print("Digite um terceiro número: ");
        double n3Double = sc.nextDouble();
        sc.close();

        int soma01 = n1Int * 2 + n2Int / 2;
        int soma02 = (int) (n1Int * 3 + n3Double);
        double soma03 = n3Double * n3Double * n3Double;
       
        System.out.println("o produto do dobro do primeiro com metade do segundo é: " + soma01);
        System.out.println("a soma do triplo do primeiro com o terceiro é: " + soma02);
        System.out.printf("o terceiro elevado ao cubo é: %.2f", soma03);

    }
}

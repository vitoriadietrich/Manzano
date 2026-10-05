import java.util.Scanner;

public class DivisivelPor4e5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 4 == 0 && numero % 5 == 0) {
            System.out.println(numero);
        } else {
            System.out.println("Não é divisível por 4 e 5.");
        }
    }
}

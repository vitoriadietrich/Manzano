import java.util.Scanner;

public class L02K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int valor = sc.nextInt();

        if (valor <= 3) {
            System.out.println("Valor: " + valor);
        }
    }
}

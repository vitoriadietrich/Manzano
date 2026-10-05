import java.util.Scanner;

public class L02B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            numero = numero * -1;
        }

        System.out.println("Módulo: " + numero);
    }
}

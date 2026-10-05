import java.util.Scanner;

public class L03I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double soma = 0;

        while (contador < 10) {
            System.out.print("Valor " + (contador + 1) + ": ");
            soma += sc.nextDouble();
            contador++;
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma / 10));
    }
}

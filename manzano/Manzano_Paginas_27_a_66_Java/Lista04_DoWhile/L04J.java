import java.util.Scanner;

public class L04J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Não existe divisão por zero.");
            return;
        }

        boolean negativo = (dividendo < 0) != (divisor < 0);
        int resto = dividendo < 0 ? -dividendo : dividendo;
        int divisorPositivo = divisor < 0 ? -divisor : divisor;
        int quociente = 0;

        if (resto >= divisorPositivo) {
            do {
                resto -= divisorPositivo;
                quociente++;
            } while (resto >= divisorPositivo);
        }

        if (negativo) quociente = -quociente;
        System.out.println("Quociente inteiro: " + quociente);
    }
}

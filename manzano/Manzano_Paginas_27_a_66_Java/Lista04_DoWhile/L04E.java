import java.math.BigInteger;
import java.util.Scanner;

public class L04E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        BigInteger somaFatoriais = BigInteger.ZERO;

        do {
            System.out.print("Valor " + contador + " (não negativo): ");
            int valor = sc.nextInt();

            if (valor < 0) {
                System.out.println("Fatorial não existe para número negativo.");
            } else {
                BigInteger fatorial = BigInteger.ONE;
                int i = 1;

                if (valor > 1) {
                    do {
                        fatorial = fatorial.multiply(BigInteger.valueOf(i));
                        i++;
                    } while (i <= valor);
                }

                somaFatoriais = somaFatoriais.add(fatorial);
                contador++;
            }
        } while (contador <= 15);

        System.out.println("Somatório dos fatoriais: " + somaFatoriais);
    }
}

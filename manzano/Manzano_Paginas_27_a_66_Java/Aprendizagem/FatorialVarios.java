import java.util.Scanner;

public class FatorialVarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "SIM";

        while (resposta.equalsIgnoreCase("SIM")) {
            System.out.print("Fatorial de qual número? ");
            int numero = sc.nextInt();
            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println(numero + "! = " + fatorial);
            System.out.print("Deseja continuar? (SIM/NAO): ");
            resposta = sc.next();
        }
    }
}

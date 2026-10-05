import java.util.Scanner;

public class L05H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Expoente inteiro: ");
        int expoente = sc.nextInt();

        int limite = expoente < 0 ? -expoente : expoente;
        double resultado = 1;

        for (int i = 0; i < limite; i++) {
            resultado *= base;
        }

        if (expoente < 0) resultado = 1 / resultado;
        System.out.println("Resultado: " + resultado);
    }
}

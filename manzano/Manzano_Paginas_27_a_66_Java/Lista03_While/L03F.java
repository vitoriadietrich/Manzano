import java.util.Scanner;

public class L03F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Expoente inteiro: ");
        int expoente = sc.nextInt();

        int limite = expoente < 0 ? -expoente : expoente;
        int i = 0;
        double resultado = 1;

        while (i < limite) {
            resultado *= base;
            i++;
        }

        if (expoente < 0) resultado = 1 / resultado;
        System.out.println("Resultado: " + resultado);
    }
}

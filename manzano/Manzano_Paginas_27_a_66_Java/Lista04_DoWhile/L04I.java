import java.util.Scanner;

public class L04I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean temValor = false;
        int maior = 0, menor = 0;
        int valor;

        do {
            System.out.print("Digite um valor positivo ou negativo para encerrar: ");
            valor = sc.nextInt();

            if (valor >= 0) {
                if (!temValor) {
                    maior = menor = valor;
                    temValor = true;
                } else {
                    if (valor > maior) maior = valor;
                    if (valor < menor) menor = valor;
                }
            }
        } while (valor >= 0);

        if (temValor) {
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }
    }
}

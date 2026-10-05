import java.util.Scanner;

public class L03L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor positivo ou negativo para encerrar: ");
        int valor = sc.nextInt();

        boolean temValor = false;
        int maior = 0, menor = 0;

        while (valor >= 0) {
            if (!temValor) {
                maior = menor = valor;
                temValor = true;
            } else {
                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;
            }

            System.out.print("Próximo valor: ");
            valor = sc.nextInt();
        }

        if (temValor) {
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }
    }
}

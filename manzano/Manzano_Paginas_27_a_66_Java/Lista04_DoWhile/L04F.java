import java.util.Scanner;

public class L04F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int quantidade = 0;
        double valor;

        do {
            System.out.print("Digite um valor positivo ou negativo para encerrar: ");
            valor = sc.nextDouble();

            if (valor >= 0) {
                soma += valor;
                quantidade++;
            }
        } while (valor >= 0);

        System.out.println("Soma: " + soma);
        System.out.println("Quantidade: " + quantidade);
        if (quantidade > 0) {
            System.out.println("Média: " + (soma / quantidade));
        } else {
            System.out.println("Média: não calculada, pois nenhum valor positivo foi informado.");
        }
    }
}

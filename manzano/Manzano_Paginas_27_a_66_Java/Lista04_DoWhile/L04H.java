import java.util.Scanner;

public class L04H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double areaTotal = 0;
        String resposta;

        do {
            System.out.print("Nome do cômodo: ");
            String nome = sc.next();
            System.out.print("Largura: ");
            double largura = sc.nextDouble();
            System.out.print("Comprimento: ");
            double comprimento = sc.nextDouble();

            double area = largura * comprimento;
            areaTotal += area;
            System.out.printf("Área de %s: %.2f m²%n", nome, area);

            System.out.print("Deseja continuar? (SIM/NAO): ");
            resposta = sc.next();
        } while (!resposta.equalsIgnoreCase("NAO"));

        System.out.printf("Área total: %.2f m²%n", areaTotal);
    }
}

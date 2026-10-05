import java.util.Scanner;

public class L03K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "SIM";
        double areaTotal = 0;

        while (resposta.equalsIgnoreCase("SIM")) {
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
        }

        System.out.printf("Área total: %.2f m²%n", areaTotal);
    }
}

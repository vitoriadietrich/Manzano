import java.util.Scanner;

public class L02D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: "); double n1 = sc.nextDouble();
        System.out.print("Nota 2: "); double n2 = sc.nextDouble();
        System.out.print("Nota 3: "); double n3 = sc.nextDouble();
        System.out.print("Nota 4: "); double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.printf("Aprovado. Média: %.2f%n", media);
        } else {
            System.out.print("Nota do exame: ");
            double exame = sc.nextDouble();
            double novaMedia = (media + exame) / 2;
            System.out.printf("Nova média: %.2f%n", novaMedia);
            System.out.println(novaMedia >= 5 ? "Aprovado em exame." : "Reprovado.");
        }
    }
}

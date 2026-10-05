import java.util.Scanner;

public class L02C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: "); double n1 = sc.nextDouble();
        System.out.print("Nota 2: "); double n2 = sc.nextDouble();
        System.out.print("Nota 3: "); double n3 = sc.nextDouble();
        System.out.print("Nota 4: "); double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.printf("Média: %.2f%n", media);

        if (media >= 5) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}

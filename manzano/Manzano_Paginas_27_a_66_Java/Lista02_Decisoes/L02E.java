import java.util.Scanner;

public class L02E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: "); double a = sc.nextDouble();
        System.out.print("B: "); double b = sc.nextDouble();
        System.out.print("C: "); double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("A deve ser diferente de zero.");
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Não existem raízes reais.");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("x1 = %.2f%n", x1);
                System.out.printf("x2 = %.2f%n", x2);
            }
        }
    }
}

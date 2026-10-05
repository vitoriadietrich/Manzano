import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado A: "); double a = sc.nextDouble();
        System.out.print("Lado B: "); double b = sc.nextDouble();
        System.out.print("Lado C: "); double c = sc.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("As medidas não formam um triângulo.");
        }
    }
}

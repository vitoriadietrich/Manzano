import java.util.Scanner;

public class L02A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Segundo valor: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Diferença do maior pelo menor: " + (a - b));
        } else {
            System.out.println("Diferença do maior pelo menor: " + (b - a));
        }
    }
}

import java.util.Scanner;

public class L02G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor 1: "); int a = sc.nextInt();
        System.out.print("Valor 2: "); int b = sc.nextInt();
        System.out.print("Valor 3: "); int c = sc.nextInt();
        System.out.print("Valor 4: "); int d = sc.nextInt();

        System.out.println("Divisíveis por 2 e 3:");
        if (a % 2 == 0 && a % 3 == 0) System.out.println(a);
        if (b % 2 == 0 && b % 3 == 0) System.out.println(b);
        if (c % 2 == 0 && c % 3 == 0) System.out.println(c);
        if (d % 2 == 0 && d % 3 == 0) System.out.println(d);
    }
}

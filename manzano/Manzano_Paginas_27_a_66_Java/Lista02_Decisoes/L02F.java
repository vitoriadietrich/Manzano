import java.util.Scanner;

public class L02F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: "); int a = sc.nextInt();
        System.out.print("B: "); int b = sc.nextInt();
        System.out.print("C: "); int c = sc.nextInt();

        int temp;
        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (b > c) { temp = b; b = c; c = temp; }

        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
    }
}

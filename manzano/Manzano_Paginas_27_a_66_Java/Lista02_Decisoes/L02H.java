import java.util.Scanner;

public class L02H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor 1: "); int a = sc.nextInt();
        System.out.print("Valor 2: "); int b = sc.nextInt();
        System.out.print("Valor 3: "); int c = sc.nextInt();
        System.out.print("Valor 4: "); int d = sc.nextInt();
        System.out.print("Valor 5: "); int e = sc.nextInt();

        int maior = a, menor = a;
        if (b > maior) maior = b; if (b < menor) menor = b;
        if (c > maior) maior = c; if (c < menor) menor = c;
        if (d > maior) maior = d; if (d < menor) menor = d;
        if (e > maior) maior = e; if (e < menor) menor = e;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}

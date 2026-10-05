public class L05K {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 10; numero++) {
            if (numero % 2 != 0) {
                long fatorial = 1;

                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }

                System.out.println(numero + "! = " + fatorial);
            }
        }
    }
}

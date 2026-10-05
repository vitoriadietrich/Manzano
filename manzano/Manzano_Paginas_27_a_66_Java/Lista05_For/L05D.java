public class L05D {
    public static void main(String[] args) {
        int soma = 0;

        for (int numero = 1; numero <= 500; numero++) {
            if (numero % 2 == 0) {
                soma += numero;
            }
        }

        System.out.println("Soma dos pares: " + soma);
    }
}

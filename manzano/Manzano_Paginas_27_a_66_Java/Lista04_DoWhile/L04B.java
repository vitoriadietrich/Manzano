public class L04B {
    public static void main(String[] args) {
        int numero = 2, soma = 0;

        do {
            soma += numero;
            numero += 2;
        } while (numero <= 500);

        System.out.println("Soma dos pares: " + soma);
    }
}

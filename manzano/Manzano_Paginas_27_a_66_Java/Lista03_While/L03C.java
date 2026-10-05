public class L03C {
    public static void main(String[] args) {
        int numero = 2, soma = 0;

        while (numero <= 500) {
            soma += numero;
            numero += 2;
        }

        System.out.println("Soma dos pares: " + soma);
    }
}

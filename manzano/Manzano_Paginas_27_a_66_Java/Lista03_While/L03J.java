public class L03J {
    public static void main(String[] args) {
        int numero = 50, quantidade = 0, soma = 0;

        while (numero <= 70) {
            if (numero % 2 == 0) {
                soma += numero;
                quantidade++;
            }
            numero++;
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + ((double) soma / quantidade));
    }
}

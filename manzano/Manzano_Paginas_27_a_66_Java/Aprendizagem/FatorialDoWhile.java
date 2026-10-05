public class FatorialDoWhile {
    public static void main(String[] args) {
        int contador = 1;
        long fatorial = 1;

        do {
            fatorial *= contador;
            contador++;
        } while (contador <= 5);

        System.out.println("5! = " + fatorial);
    }
}

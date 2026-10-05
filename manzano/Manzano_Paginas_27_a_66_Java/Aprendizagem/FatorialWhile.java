public class FatorialWhile {
    public static void main(String[] args) {
        int contador = 1;
        long fatorial = 1;

        while (contador <= 5) {
            fatorial *= contador;
            contador++;
        }

        System.out.println("5! = " + fatorial);
    }
}

public class FatorialFor {
    public static void main(String[] args) {
        long fatorial = 1;

        for (int contador = 1; contador <= 5; contador++) {
            fatorial *= contador;
        }

        System.out.println("5! = " + fatorial);
    }
}

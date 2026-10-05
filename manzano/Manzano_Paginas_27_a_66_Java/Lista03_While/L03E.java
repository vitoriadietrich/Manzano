public class L03E {
    public static void main(String[] args) {
        int expoente = 0;
        long potencia = 1;

        while (expoente <= 15) {
            System.out.println("3^" + expoente + " = " + potencia);
            potencia *= 3;
            expoente++;
        }
    }
}

public class L05G {
    public static void main(String[] args) {
        long potencia = 1;

        for (int expoente = 0; expoente <= 15; expoente++) {
            System.out.println("3^" + expoente + " = " + potencia);
            potencia *= 3;
        }
    }
}

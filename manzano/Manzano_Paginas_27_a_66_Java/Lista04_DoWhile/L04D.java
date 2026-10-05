import java.math.BigInteger;

public class L04D {
    public static void main(String[] args) {
        int casa = 1;
        BigInteger graosNaCasa = BigInteger.ONE;
        BigInteger total = BigInteger.ZERO;

        do {
            total = total.add(graosNaCasa);
            graosNaCasa = graosNaCasa.multiply(BigInteger.TWO);
            casa++;
        } while (casa <= 64);

        System.out.println("Total de grãos: " + total);
    }
}

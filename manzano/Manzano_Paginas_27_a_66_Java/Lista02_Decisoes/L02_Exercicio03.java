public class L02_Exercicio03 {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 5, d = 9;

        System.out.println("A: " + (!(d > 5) ? "x <- (a + b) * d" : "x <- (a - b) / c"));
        System.out.println("B: " + ((a > 2 && b < 7) ? "x <- (a + 2) * (b - 2)" : "x <- (a + b) / d * (c + d)"));
        System.out.println("C: " + ((a == 2 || b < 7) ? "x <- (a + 2) * (b - 2)" : "x <- (a + b) / d * (c + d)"));
        System.out.println("D: " + ((a > 2 || !(b < 7)) ? "x <- a + b - 2" : "x <- a - b"));
        System.out.println("E: " + ((!(a > 2) || !(b < 7)) ? "x <- a + b" : "x <- a / b"));
        System.out.println("F: " + ((!(a > 3) && !(b < 5)) ? "x <- a + d" : "x <- d / b"));
        System.out.println("G: " + ((c >= 2 && b <= 7) ? "x <- (a + d) / 2" : "x <- d * c"));
        System.out.println("H: " + ((a >= 2 || c <= 1) ? "x <- (a + d) / 2" : "x <- d * c"));
    }
}

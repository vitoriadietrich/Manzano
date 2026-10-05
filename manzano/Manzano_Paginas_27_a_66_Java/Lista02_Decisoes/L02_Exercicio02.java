public class L02_Exercicio02 {
    public static void main(String[] args) {
        int x = 1, a = 3, b = 5, c = 8, d = 7;

        System.out.println("A: " + (!(x > 3) ? "Verdadeiro" : "Falso"));
        System.out.println("B: " + (((x < 1) && !(b > d)) ? "Verdadeiro" : "Falso"));
        System.out.println("C: " + ((!(d < 0) && (c > 5)) ? "Verdadeiro" : "Falso"));
        System.out.println("D: " + ((!(x > 3) && (c < 7)) ? "Verdadeiro" : "Falso"));
        System.out.println("E: " + (((a > b) || (c > b)) ? "Verdadeiro" : "Falso"));
        System.out.println("F: " + ((x >= 2) ? "Verdadeiro" : "Falso"));
        System.out.println("G: " + (((x < 1) && (b >= d)) ? "Verdadeiro" : "Falso"));
        System.out.println("H: " + (((d < 0) || (c > 5)) ? "Verdadeiro" : "Falso"));
        System.out.println("I: " + ((!(d > 3) || !(b < 7)) ? "Verdadeiro" : "Falso"));
        System.out.println("J: " + (((a > b) || !(c > b)) ? "Verdadeiro" : "Falso"));
    }
}

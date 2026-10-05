public class L02_Exercicio01 {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("A: " + ((2 > 3) ? "Verdadeiro" : "Falso"));
        System.out.println("B: " + (((6 < 8) || (3 > 7)) ? "Verdadeiro" : "Falso"));
        System.out.println("C: " + (!(2 < 3) ? "Verdadeiro" : "Falso"));
        System.out.println("D: " + (((5 >= 6) || (6 < 7) || !(a + 5 - 6 == 8)) ? "Verdadeiro" : "Falso"));
    }
}

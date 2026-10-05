public class L03H {
    public static void main(String[] args) {
        int celsius = 10;

        while (celsius <= 100) {
            double fahrenheit = (9.0 * celsius + 160) / 5;
            System.out.printf("%d °C = %.1f °F%n", celsius, fahrenheit);
            celsius += 10;
        }
    }
}

public class L03G {
    public static void main(String[] args) {
        long anterior = 1, atual = 1;
        int termo = 1;

        while (termo <= 15) {
            System.out.print(anterior + (termo < 15 ? ", " : "\n"));
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            termo++;
        }
    }
}

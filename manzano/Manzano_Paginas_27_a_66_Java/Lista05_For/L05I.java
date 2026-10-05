public class L05I {
    public static void main(String[] args) {
        long anterior = 1, atual = 1;

        for (int termo = 1; termo <= 15; termo++) {
            System.out.print(anterior + (termo < 15 ? ", " : "\n"));
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}

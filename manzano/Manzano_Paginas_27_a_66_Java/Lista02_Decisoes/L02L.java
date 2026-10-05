import java.util.Scanner;

public class L02L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Sexo (M/F ou masculino/feminino): ");
        String sexo = sc.nextLine();

        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("masculino")) {
            System.out.println("Ilmo Sr. " + nome);
        } else if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("feminino")) {
            System.out.println("Ilma Sra. " + nome);
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}

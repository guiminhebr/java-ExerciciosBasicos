import java.time.OffsetDateTime;
import java.util.Scanner;

public class NomeAno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anoAtual = OffsetDateTime.now().getYear();
        System.out.println("Informe seu nome:");
        String nome = input.nextLine();
        System.out.println("Informe seu ano de nascimento:");
        int anoNascimento = input.nextInt();
        int idade = anoAtual - anoNascimento;
        System.out.printf("Olá %s você tem %s anos.", nome, idade);

    }
}

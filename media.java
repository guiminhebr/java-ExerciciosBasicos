import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu nome primeira pessoa: ");
        String nome1 = input.next();
        System.out.println("Informe sua idade");
        int idade1 = input.nextInt();
        System.out.println("Informe seu nome segunda pessoa: ");
        String nome2 = input.next();
        System.out.println("Informe sua idade");
        int idade2 = input.nextInt();
        var media = (idade1+idade2)/2;
        System.out.printf("A media da idade entre %s e %s é: %s",nome1, nome2, media);



    }
}

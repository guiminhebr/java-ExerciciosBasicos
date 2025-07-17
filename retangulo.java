import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a base do retângulo:");
        int base = input.nextInt();
        System.out.println("Informe a altura do retângulo:");
        int alt = input.nextInt();
        int ret = base*alt;
        System.out.println("A area do retângulo é: "+ret);

    }
}

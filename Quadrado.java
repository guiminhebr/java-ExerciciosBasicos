import java.util.Scanner;
public class Quadrado {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o lado do quadrado:");
        int lado = input.nextInt();
        int area = lado*lado;
        System.out.printf("A área do quadrado é: %s", area);


    }
}

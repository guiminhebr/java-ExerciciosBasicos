import java.util.Scanner;

public class estruturaDeControle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = Verificacao("Informe um número para ser gerado sua tabuda de 1 a 10", input);
        Tabuada(numero);

    }

    public static int Verificacao(String mensagem, Scanner input){

        while (true) {
            try{
                System.out.println(mensagem);
                int numero = input.nextInt();
                return numero;
            }catch(Exception e) {
                System.out.println("Informe um valor válido.");
                input.nextLine();
            }

        }

    }
    public static void Tabuada(int numero){
        for(int i = 1; i <= 10;i++){
            System.out.printf("%sx%s = %s \n", numero, i,numero*i);
        }
    }
}

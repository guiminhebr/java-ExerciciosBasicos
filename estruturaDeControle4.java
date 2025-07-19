import java.util.Scanner;

public class estruturaDeControle4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o número inicial:");
        int numeroInicial = input.nextInt();
        while (true){
            System.out.println("Informe um número que irá ser dividido pelo número inicial. Se o número informado dividido pelo primeiro ter resto diferente de 0, a execução é quebrada.");
            int numero = input.nextInt();
            if (numero < numeroInicial){
                System.out.println("Informe um número maior que "+ numeroInicial);
                continue;
            }
            if(numero%numeroInicial != 0){
                System.out.println("O resto é: "+ numero%numeroInicial);
                System.out.println("O resto é diferente de 0. Quebrando a execução agora.");
                break;
            }else {
                System.out.println("O resto é: "+ numero%numeroInicial);

            }


        }
        System.out.println("Estou fora do loop.");


    }
}

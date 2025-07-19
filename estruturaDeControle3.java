import java.util.Scanner;
/*


Escreva um código que o usuário entre com um primeiro número,
um segundo número maior que o primeiro e escolhe entre a opção par
e impar, com isso o código deve informar todos os números pares ou
ímpares (de acordo com a seleção inicial) no intervalo de números informados,
 incluindo os números informados e em ordem decrescente;

 */
public class estruturaDeControle3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2;
        numero1 = Validacao("Informe o primeiro número", input);
        numero2 = Comparacao(input,numero1);
        System.out.println(numero1 +" e "+numero2);
        String parImpar = ParOuImpar("Insira se quer Par ou Impar.", input);
        System.out.println("Agora vem os looooops..");
        loops(numero1,numero2,parImpar);









    }
    public static void loops(int numero1, int numero2, String parImpar){
        if(parImpar.equalsIgnoreCase("Par")){
            for(int i = numero2; numero1 <= i; i--){
                if(i%2 == 0){
                    System.out.println(i);
                }

            }

        }else if(parImpar.equalsIgnoreCase("Impar")){
            for(int i = numero2; numero1 <= i; i--){
                if(i%2 != 0){
                    System.out.println(i);
                }


            }
        }
    }
    public static String ParOuImpar(String mensagem, Scanner input){
        while (true){
            try{
                System.out.println(mensagem);
                String parImpar = input.next();
                if(parImpar.equalsIgnoreCase("Par")){
                    System.out.println("Você escolheu par");
                    return parImpar;
                }else if(parImpar.equalsIgnoreCase("Impar")){
                    return parImpar;
                }else {
                    System.out.println("Valor inválido.");
                }
            } catch (Exception e) {
                System.out.println("Valor inválido.");
                input.next();
            }

        }

    }

    public static int Validacao(String mensagem, Scanner input){
        while (true){
            try{
                System.out.println(mensagem);
                int numero = input.nextInt();
                return numero;

            } catch (Exception e) {
                System.out.println("Informe um valor válido.");
                input.next();
            }

        }
    }

    public static int Comparacao(Scanner input, int numero1){
        while (true) {
            int numero2 = Validacao("Informe o segundo número, tem que ser maior que o primeiro", input);
            if (numero2 < numero1) {
                continue;
            } else {
                return numero2;

            }
        }

    }
}

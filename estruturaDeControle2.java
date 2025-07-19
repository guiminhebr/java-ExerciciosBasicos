import java.util.Scanner;

public class estruturaDeControle2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura = Validacao("Informe sua altura", input);
        double peso = Validacao("Informe seu peso", input);
        IMC(altura,peso);


    }
    public static double Validacao(String mensagem, Scanner input){
        while(true){
            try{
                System.out.println(mensagem);
                double numero = input.nextDouble();
                return numero;

            } catch (Exception e) {
                System.out.println("Informe um valor número válido.");
                input.nextLine();
            }

        }

    }
    public static void IMC(double altura, double peso){
        double IMC = peso/(altura*altura);
        System.out.println("Seu IMC é "+ (int)IMC);
        if( IMC <= 18.5){
            System.out.println("Você está Abaixo do peso");
        }else if( IMC >= 18.6 && IMC <= 24.9){
            System.out.println("Você está no Peso Ideal");
        }else if (IMC >= 25.0 && IMC < 29.9){
            System.out.println("Você está levemente acima do peso");
        }else if( IMC >= 30.0 && IMC <= 34.9){
            System.out.println("Você está com Obesidade Grau I");
        }else if(IMC >= 35 && IMC <= 39.9){
            System.out.println("Você está com Obesidade Grau II");
        }else {
            System.out.println("Você está com Obesidade Grau III");
        }


    }

}

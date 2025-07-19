import java.util.Scanner;

public class InterfaceCarro {
    public static void main(String[] args) {
        Carro c= new Carro();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Bem vindo ao seu novo carro!");
            System.out.println("=== ESCOLHA AS OPÇÕES ===");
            System.out.println("1- Ligar o CARRO");
            System.out.println("2- Mostrar Estado do Carro");
            System.out.println("3- Desligar Carro");
            System.out.println("4- Acelerar Carro");
            System.out.println("5- Desacelerar Carro");
            System.out.println("6- Virar carro pra direita");
            System.out.println("7- Virar carro pra esquerda");



            int option = input.nextInt();
            switch (option){
                case 1-> c.ligarCarro();
                case 2 -> c.mostrarEstado();
                case 3 -> c.desligarCarro();
                case 4 -> c.acelerarCarro();
                case 5 -> c.desacelerarCarro();
                case 6 -> c.virarCarroDireita();
                case 7 -> c.virarCarroEsquerda();
                default -> System.out.println("Comando não reconhecido.");
            }

        }



    }
}

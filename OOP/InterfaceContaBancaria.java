import java.util.Scanner;

public class InterfaceContaBancaria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria conta = null;
        Boleto boleto = null;

        while (true){
            System.out.println("Bem vindo ao programa de Conta Bancária.");
            System.out.println("===Escolha as Opções===");
            System.out.println("1-Criar Conta");
            System.out.println("2-Consultar Saldo");
            System.out.println("3-Depositar Dinheiro");
            System.out.println("4-Sacar Dinheiro");
            System.out.println("5-Criar boleto. obs só é permitido um boleto por vez.");
            System.out.println("6-Pagar boleto");
            System.out.println("0 - SAIR DA APLICAÇÃO");
            int option = input.nextInt();
            switch(option){
                case 1 -> {
                    if (conta == null){
                        conta = criandoConta(input);
                    }else {
                        System.out.println("Conta já foi criada.");
                    }

                }
                case 2 -> {
                    if (conta != null){
                        System.out.println("O saldo é: "+ conta.getSaldo());

                    }else {
                        System.out.println("Crie uma conta primeiro.");
                    }
                }
                case 3 -> DepositarDinheiro(input, conta);
                case 4 -> SacarDInheiro(conta, input);
                case 5 -> {
                    if (boleto == null){
                        boleto = criarBoleto(input);
                    }else {
                        System.out.println("Boleto já foi criado.");
                    }
                }
                case 6 -> {
                    if (conta == null) {
                        System.out.println("Crie uma conta primeiro.");
                    } else if (boleto == null) {
                        System.out.println("Nenhum boleto criado.");
                    } else if (conta.pagarBoleto(boleto)) {
                        boleto = null;
                    } else {
                        System.out.println("Adicione mais saldo.");
                    }
                }


            }
        }



    }


    private static Boleto criarBoleto(Scanner input) {
            System.out.println("Qual o valor do boleto?");
            double valor = input.nextDouble();
            Boleto b = new Boleto(valor);
            System.out.println("Boleto criado!");
            return b;
    }

    private static void SacarDInheiro(ContaBancaria conta, Scanner input) {
        if(conta != null){
            System.out.println("Escolha o valor a ser sacado.");
            double valor = input.nextDouble();
            conta.sacarDinheiro(valor);
        }else {
            System.out.println("Crie uma conta primeiro.");
        }
    }

    private static void DepositarDinheiro(Scanner input, ContaBancaria conta) {
        if(conta != null){
            System.out.println("Escolha o valor a ser depositado: ");
            double valor = input.nextDouble();
            conta.depositarDinheiro(valor);

        }else {
            System.out.println("Crie uma conta primeiro.");
        }


    }

    private static ContaBancaria criandoConta(Scanner input) {


        System.out.println("Qual seu nome?");
        String name = input.next();
        System.out.println("Ok,"+ name+" Qual valor você quer depositar a sua nova conta?");
        double valor = input.nextDouble();
        ContaBancaria conta1 = new ContaBancaria(valor);
        System.out.println("Conta criada!");
        return conta1;
    }
}

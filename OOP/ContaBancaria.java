public class ContaBancaria {
    /*
    Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
Consultar saldo -
consultar cheque especial -
Depositar dinheiro; -
Sacar dinheiro; -
Pagar um boleto.
Verificar se a conta está usando cheque especial.
Siga as seguintes regras para implementar

A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

     */
    private double saldo;
    private double chequeEspecial;
    public ContaBancaria(double saldo){
        this.saldo = saldo;
        if(saldo <= 500){
            this.chequeEspecial = 50;
        }else {
            double porcentagem = (double) 50/100;
            this.chequeEspecial = saldo*porcentagem;
        }
    }

    public double getSaldo() { //consultar saldo
        return saldo;
    }

    public double getChequeEspecial() { //consultar cheque
        return chequeEspecial;
    }
    public void depositarDinheiro(double money){
        if(money > 0){
            this.saldo = this.saldo+money;
        }else {
            System.out.println("Valor inválido.");
        }

    }
    public void sacarDinheiro(double retirar){
        if(retirar <= this.saldo){
            this.saldo = this.saldo-retirar;
        }else {
            System.out.println("Não tem essa quantia no saldo.");
        }
    }
    public boolean pagarBoleto(Boleto b){
        if(this.saldo >= b.getValor()){
            System.out.println("Você tem valor suficiente pra pagar o boleto.");
            this.saldo = this.saldo - b.getValor();
            b.setPago(true);
            return true;

        }else {
            System.out.println("Você não tem valor suficiente pra pagar o boleto.");
            return false;


        }

    }
}

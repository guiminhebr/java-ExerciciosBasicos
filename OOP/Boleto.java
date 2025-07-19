public class Boleto {
    private boolean pago;
    private double valor;
    public Boleto(double valor){
        if(valor > 0){
            this.valor = valor;
            this.pago = false;
        }else {
            System.out.println("Valor Inválido.");
        }
    }

    public double getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

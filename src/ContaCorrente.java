public class ContaCorrente extends Conta{
    private double Limite;

    public ContaCorrente(int numero, double saldo, double limite) {
        super(numero, saldo);
        Limite = limite;
    }

    public double getLimite() {
        return Limite;
    }

    public void setLimite(double limite) {
        Limite = limite;
    }

    public double consultaSaldoTotal(){
        return getLimite() + getSaldo();
    }
}

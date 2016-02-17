package banco;

public class ContaCorrente {

    private Double saldo;
    private Double limite;

    public ContaCorrente() {
    }

    public ContaCorrente(Double saldo, Double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        if (limite != null && limite > 0) {
            this.limite = limite;
        }
    }

    public void deposito(Double valor) {

    }

    public void saque(Double valor) {

    }

    public String metodoX() {
        return "";
    }

}

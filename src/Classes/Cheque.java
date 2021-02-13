package Classes;

public class Cheque extends FormaPagamento{

    String banco, agencia, titular;
    boolean contaCorrente;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public boolean isContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(boolean contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    
    
}

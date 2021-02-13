package Classes;

import java.util.Date;

public class CartaoCredito {

    int numero;
    String bandeira;
    Date dataExpiracao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public CartaoCredito(int numero, String bandeira, Date dataExpiracao) {
        this.numero = numero;
        this.bandeira = bandeira;
        this.dataExpiracao = dataExpiracao;
    }
}

package Classes;

public class Telefone {
    
    String tipo;
    long numero, codigoDDD;

    Telefone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public long getCodigoDDD() {
        return codigoDDD;
    }

    public void setCodigoDDD(long codigoDDD) {
        this.codigoDDD = codigoDDD;
    }

    public Telefone(String tipo, long numero, long codigoDDD) {
        this.tipo = tipo;
        this.numero = numero;
        this.codigoDDD = codigoDDD;
    }
    
    public String obterNumero() {
        return tipo + " " + numero + " " + codigoDDD;
    }
}

package Classes;

public class Dinheiro extends FormaPagamento{

    double quantia;

    public double getQuantia() {
        return quantia;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }

    public Dinheiro(double quantia) {
        this.quantia = quantia;
    }
    
    
}

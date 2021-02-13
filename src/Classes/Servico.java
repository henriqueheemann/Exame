package Classes;

public class Servico extends FormaPagamento{

    int id;
    String descricao;
    double preco, percentualAbatimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualAbatimento() {
        return percentualAbatimento;
    }

    public void setPercentualAbatimento(double percentualAbatimento) {
        this.percentualAbatimento = percentualAbatimento;
    }
    
    
}

package Classes;

public class ItemOrdemServico {

    private int id;
    private int quantidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ItemOrdemServico(int id, int quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }
    
    
}

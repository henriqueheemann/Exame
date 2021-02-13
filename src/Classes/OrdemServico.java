package Classes;

import java.util.Date;

public class OrdemServico {

    int id;
    Date dataEmissao;
    String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public OrdemServico(int id, Date dataEmissao, String estado) {
        this.id = id;
        this.dataEmissao = dataEmissao;
        this.estado = estado;
    }
    
    
}

package Classes;

public class Cliente {

    private String nome;
    private long rg, cpf;
    private Endereco endereco;
    private Telefone telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Cliente(String nome, long rg, long cpf) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = new Endereco();
        this.telefone = new Telefone();
    }
    
    public String obterEndereco() {
        return endereco.obterCidade();
    }
    
    public String obterTelefone() {
        return telefone.obterNumero();
    }
}

public class Gato {
    private String nome;
    private Integer idade;
    private Double peso;
    private String comportamento;
    private Double valorVenda;
    private Cliente dono;

    public Gato() {
        this.valorVenda = 0.0;
        this.dono = null;
    }

    public Gato(String nome, Integer idade, Double peso, String comportamento) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.comportamento = comportamento;
        this.valorVenda = 0.0;
        this.dono = null;
    }

    public void setDono(Cliente cli) {
        this.dono = cli;
    }

    public Cliente getDono() {
        return this.dono;
    }

    public void setValorVenda(Double valor) {
        this.valorVenda = valor;
    }

    public Double getValorVenda() {
        return this.valorVenda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setPeso(Double p) {
        this.peso = p;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }

    public String getComportamento() {
        return this.comportamento;
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("Sou " + this.nome + " e tenho " + this.idade + " anos");
    }
}
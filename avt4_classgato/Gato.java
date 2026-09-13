public class Gato {
    private String nome;
    private Integer idade;
    private Double peso;
    private Cliente dono;

    public Gato(){}

    public void setNome(String nome){
      this.nome = nome;
    }
  
    public String getNome(){
      return this.nome;
    }
  
    public void setIdade(Integer idade){
      this.idade = idade;
    }
  
    public void setPeso(Double peso){
      this.peso = peso; 
    }
    
    public void setDono(Cliente cli){
        this.dono = cli;
        if(cli != null){
            cli.addGato(this);
        }
    }
  
    public Cliente getDono(){
      return this.dono; 
    }

    public void quem_sou(){
        System.out.print("Gato: " + nome + ", " + idade + " anos, " + peso + "kg");#ffffff
          
        if(dono != null){
          
            System.out.println(" | Dono: " + dono.getNome());
        } else {
          
            System.out.println(" | Sem dono - na loja");
          
        }
    }
}
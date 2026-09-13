import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Gato> meusGatos = new ArrayList<>();

    public Cliente(){
      
    }
  
    public void setNome(String nome){
      this.nome = nome;
    }
  
    public String getNome(){
      return this.nome; 
    }
  
    public void setCPF(String cpf){
      this.cpf = cpf; 
    }
    
    public void addGato(Gato g){
      meusGatos.add(g); 
    }
    public ArrayList<Gato> getGatos(){
      return meusGatos; 
    }
}
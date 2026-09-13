public class Gato {
  private String nome;
  private int idade;
  private double peso;

  public Gato (String nome, int idade, double peso){
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
  }

  public Gato(){
    idade = 0;
    peso = 0.0;
  }

  public Gato (String nome){
    this.nome = nome;
    idade = 0;
    peso = 0.0;
  }

  public void setNome(String nome){
    this.nome = nome;
  }
  
  public String getNome(){
    return this.nome;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }
  
  public int getIdade(){
    return this.idade;
  }

  public void setPeso(double peso){
    this.peso = peso;
  }
  
  public double getPeso(){
    return this.peso;
  }
}
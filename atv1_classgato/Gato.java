public class Gato {
  String nome;
  float peso;
  
  void miar(){
    System.out.println(this.nome + " mia MIAU..... MIAU .... MIAU");
  }

  void verificarpeso(){
    if (this.peso >= 8){
      System.out.println(this.nome + " está acima do peso");
    }else{
      System.out.println(this.nome + " não está acima do peso");
    }
  }

  void corre(){
    while (this.peso >= 8){
      System.out.println(this.nome + " esta correndo!");
      peso--;
    }
      System.out.println("Peso: " +peso);
  }
}
public class NinjaBasico implements Ninja {

  String nome;
  int idade;
  TipoHabilidade habilidade;

  public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
    this.nome = nome;
    this.idade = idade;
    this.habilidade = habilidade;
  }

  @Override
  public void mostrarInformacoes() {
    System.out.println("O ninja: " + this.nome + " tem " + this.idade + " anos e possui a habilidade: " + this.habilidade);
  }

  @Override
  public void executarHabilidade() {
    System.out.println("O ninja: " +  this.nome + " está usando a habilidade: " + this.habilidade);
  }
}

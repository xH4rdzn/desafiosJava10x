public class NinjaAvancado implements Ninja {

  String nome;
  int idade;
  TipoHabilidade habilidade;
  String especialidade;

  public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
    this.nome = nome;
    this.idade = idade;
    this.habilidade = habilidade;
    this.especialidade = especialidade;
  }

  @Override
  public void mostrarInformacoes() {
    System.out.println("O ninja: " + this.nome + " possui " + this.idade + " e sua habilidade é: " + this.habilidade + " e sua especialidade é: " + this.especialidade);
  }

  @Override
  public void executarHabilidade() {
    System.out.println("O ninja: " + this.nome + " está usando sua habilidade: " + this.habilidade + " juntamente com" +
        " " +
        "sua especialidade: " + this.especialidade);
  }
}

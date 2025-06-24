public class Uchiha extends Ninja{
  String habilidadeEspecial;

  public String mostrarHabilidadeEspecial() {
    return " A habilidade especial do ninja: " + nome + " é o " + habilidadeEspecial;
  }

  @Override
  public String mostarInformacoes() {
     return super.mostarInformacoes() + mostrarHabilidadeEspecial();
  }

}

public class Main {
  public static void main(String[] args) {
    NinjaBasico Naruto = new NinjaBasico("Naruto Uzumaki", 16, TipoHabilidade.NINJUTSU);

    NinjaAvancado Sasuke = new NinjaAvancado("Sasuke Uchiha", 16, TipoHabilidade.RINNENGAN, "Chidori");

    Naruto.mostrarInformacoes();
    Naruto.executarHabilidade();

    Sasuke.mostrarInformacoes();
    Sasuke.executarHabilidade();
  }
}
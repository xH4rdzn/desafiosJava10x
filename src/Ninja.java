public class Ninja {
  String nome;
  int idade;
  String missao;
  String nivelDificuldade;
  String statusMissao;

  public String mostarInformacoes() {
    return "O nome do ninja é: " + nome + " ele possui " + idade + " anos e está fazendo a missão: " + missao + " que" +
        " é do" +
        " " +
      "rank: " + nivelDificuldade + " e o status da missão é: " + statusMissao;
  }
}

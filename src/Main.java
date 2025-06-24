import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int opcao = 0;
    int ninjaASerCadastrado = 0;
    int ninjasCadastrados = 0;
    int uchihaEscolhido;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Deseja cadastrar quantos ninjas: ");
    int quantidadeNinja = scanner.nextInt();
    scanner.nextLine();
    Ninja[] ninjas = new Ninja[quantidadeNinja];

    do {
      System.out.println("-----Menu-----");
      System.out.println("1 - Cadastrar um novo ninja");
      System.out.println("2 - Listar ninjas cadastrados");
      System.out.println("3 - Atualizar habilidades especiais");
      System.out.println("4 - Sair");
      System.out.print("O que deseja fazer? ");
      opcao = scanner.nextInt();
      scanner.nextLine();
      switch (opcao) {
        case 1:
          if (ninjasCadastrados == quantidadeNinja) {
            System.out.println("Não se pode mais cadastrar ninjas");
            break;
          }
          System.out.println("O que você deseja cadastrar: ");
          System.out.println("1 - Ninja");
          System.out.println("2 - Uchiha");
          ninjaASerCadastrado = scanner.nextInt();
          scanner.nextLine();
          if (ninjaASerCadastrado == 2) {
            System.out.println("Você está cadastrando um Uchiha");
            Uchiha novoUchiha = new Uchiha();
            System.out.print("Digite o nome do Uchiha: ");
            novoUchiha.nome = scanner.nextLine();
            System.out.print("Digite a idade do Uchiha: ");
            novoUchiha.idade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite a missão do Uchiha: ");
            novoUchiha.missao = scanner.nextLine();
            System.out.print("Qual a dificuldade da missão do Uchiha: ");
            novoUchiha.nivelDificuldade = scanner.nextLine();
            System.out.print("Qual é o status da missão do Uchiha: ");
            novoUchiha.statusMissao = scanner.nextLine();
            System.out.print("Qual é a habilidade especial do Uchiha: ");
            novoUchiha.habilidadeEspecial = scanner.nextLine();
            System.out.println("Uchiha cadastrado com sucesso!");
            ninjas[ninjasCadastrados] = novoUchiha;
            ninjasCadastrados++;
          } else if (ninjaASerCadastrado == 1){
            System.out.println("Você está cadastrando um Ninja");
            Ninja novoNinja = new Ninja();
            System.out.print("Digite o nome do Ninja: ");
            novoNinja.nome = scanner.nextLine();
            System.out.print("Digite a idade do Ninja: ");
            novoNinja.idade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite a missão do Ninja: ");
            novoNinja.missao = scanner.nextLine();
            System.out.print("Qual a dificuldade da missão do Ninja: ");
            novoNinja.nivelDificuldade = scanner.nextLine();
            System.out.print("Qual é o status da missão do Ninja: ");
            novoNinja.statusMissao = scanner.nextLine();
            System.out.println("Ninja cadastrado com sucesso!");
            ninjas[ninjasCadastrados] = novoNinja;
            ninjasCadastrados++;
          } else {
            System.out.println("Opção invalidada tente novamente!");
            continue;
          }
          break;
        case 2:
          System.out.println("------Ninjas Cadastrados------");
          if (ninjasCadastrados == 0) {
            System.out.println("Não existem ninjas cadastrados. Por favor cadastre um ninja antes!");
          } else {
            for (Ninja ninja : ninjas) {
              if (ninja != null) {
                System.out.println(ninja.mostarInformacoes());
              }
            }
          }
          break;
        case 3:
          System.out.println("Só pode ser alterado habilidades especiais dos Uchihas que são: ");
          for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] instanceof Uchiha) {
              System.out.println(i + " - " + ninjas[i].nome);
            }
          }
          System.out.println("Escolha o Uchiha que você deseja alterar a habilidade especial: ");
          uchihaEscolhido = scanner.nextInt();
          scanner.nextLine();
          if (ninjas[uchihaEscolhido] instanceof  Uchiha) {
            System.out.println("O Uchiha escolhido foi: " + ninjas[uchihaEscolhido].nome);
            System.out.print("Digite agora o nome da nova habilidade especial: ");
            ((Uchiha) ninjas[uchihaEscolhido]).habilidadeEspecial = scanner.nextLine();
            System.out.println("Agora a nova habilidade é: " + ((Uchiha) ninjas[uchihaEscolhido]).habilidadeEspecial);
          }
          break;
        case 4:
          System.out.println("Encerrando o programa...");
          break;
      }
    } while (opcao != 4);
    scanner.close();
  }
}

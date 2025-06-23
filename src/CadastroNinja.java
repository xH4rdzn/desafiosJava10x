import java.util.Scanner;

public class CadastroNinja {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantos ninjas deseja cadastrar: ");
    int quantidadeNinja = scanner.nextInt();
    int ninjasCadastrados = 0;
    scanner.nextLine();
    String[] ninjas = new String[quantidadeNinja];
    int opcao = 0;
    do {
      System.out.println("----------------");
      System.out.println("1 - Cadastrar Ninja");
      System.out.println("2 - Listar Ninjas");
      System.out.println("3 - Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();
      scanner.nextLine();
      switch (opcao) {
        case 1:
          if (ninjasCadastrados == quantidadeNinja) {
            System.out.println("Lista cheia...Não se pode mais cadastrar " +
                "ninjas");
            break;
          } else {
            System.out.println("------Cadastro Ninja------");
            System.out.print("Digite o nome do ninja a ser registrado: ");
            String nomeDoNinja = scanner.nextLine();
            ninjas[ninjasCadastrados] = nomeDoNinja;
            ninjasCadastrados++;
            break;
          }
        case 2:
          if (ninjasCadastrados == 0) {
            System.out.println("Nenhum ninja cadastrado...");
            break;
          } else {
            System.out.println("Segue abaixo os ninjas cadastrados:");
            for (int i = 0; i < ninjas.length; i++) {
              System.out.println(ninjas[i]);
            }
          }
          break;
        case 3:
          System.out.println("Encerrando o programa...");
          break;
        default:
          System.out.println("Opção Inválida. Tente novamente");
      }
    } while (opcao != 3);
  }
}

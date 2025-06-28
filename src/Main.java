import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;
    int tipoConta = 0;
    int conta = 0;
    double valorDeposito;
    ContaCorrente contaCorrente = new ContaCorrente();
    ContaPoupanca contaPoupanca = new ContaPoupanca();
    do {
      System.out.println("------------MENU------------");
      System.out.println("1 - Cadastrar conta");
      System.out.println("2 - Verificar saldo");
      System.out.println("3 - Depositar");
      System.out.println("4 - Sair");
      System.out.print("Escolha a opção: ");
      opcao = scanner.nextInt();
      scanner.nextLine();

      switch (opcao) {
        case 1:
          System.out.println("Qual tipo de conta você deseja cadastrar: ");
          System.out.println("1 - Conta Corrente");
          System.out.println("2 - Conta Poupança");
          System.out.print("Qual conta deseja criar ? ");
          tipoConta = scanner.nextInt();
          scanner.nextLine();
          if (tipoConta == 1) {
            System.out.print("Digite o saldo da conta corrente: ");
            double saldo = scanner.nextDouble();
            contaCorrente.saldo = saldo;
            System.out.println("Conta criada com sucesso");
          } else if (tipoConta == 2) {
            System.out.print("Digite o saldo da conta poupança: ");
            double saldo = scanner.nextDouble();
            contaPoupanca.saldo = saldo;
            System.out.println("Conta criada com sucesso");
          } else {
            System.out.println("Opção Inválida...Tente novamente");
            continue;
          }
          break;
        case 2:
          System.out.println("Escolha qual conta deseja verificar o saldo: ");
          System.out.println("1 - Conta Corrente");
          System.out.println("2 - Conta Poupança");
          conta = scanner.nextInt();
          if (conta == 1) {
            if (contaCorrente.saldo == 0.0) {
              System.out.println("Essa conta não foi criada...ou não possui saldo");
            } else {
              contaCorrente.consultarSaldo();
            }
          } else if (conta == 2) {
            if (contaPoupanca.saldo == 0.0) {
              System.out.println("Essa conta não foi criada...ou não possui saldo");
            } else {
              contaPoupanca.consultarSaldo();
            }
          } else {
            System.out.println("Opção Inválida...Tente novamente");
            continue;
          }
          break;
        case 3:
          System.out.println("Escolha em qual conta deseja depositar: ");
          System.out.println("1 - Conta Corrente");
          System.out.println("2 - Conta Poupança");
          conta = scanner.nextInt();
          if (conta == 1) {
            System.out.print("Digite o valor que deseja depositar: ");
            valorDeposito = scanner.nextDouble();
            contaCorrente.depositar(valorDeposito);
          } else if (conta == 2) {
            System.out.println("Digite o valor que deseja depositar: ");
            valorDeposito = scanner.nextDouble();
            contaPoupanca.depositar(valorDeposito);
          } else {
            System.out.println("Opção Inválida...Tente Novamente");
            continue;
          }
          break;
        case 4:
          System.out.println("Encerrando programa...");
          break;
      }
    } while (opcao != 4);
  }
}
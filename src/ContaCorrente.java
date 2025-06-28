public class ContaCorrente extends ContaBancaria {

  public ContaCorrente() {
  }

  public ContaCorrente(double saldo) {
    this.saldo = saldo;
  }

  @Override
  public void consultarSaldo() {
    System.out.println("O seu saldo atual é: " + saldo);
  }

  @Override
  public void depositar(double valor) {
    saldo += valor;
    System.out.println("Você depositou: R$ " + valor + "seu novo saldo é: R$ " + (valor + saldo));
  }
}

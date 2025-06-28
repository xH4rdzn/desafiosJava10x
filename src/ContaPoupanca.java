public class ContaPoupanca extends ContaBancaria {

  public ContaPoupanca(double saldo) {
    this.saldo = saldo;
  }

  public ContaPoupanca() {
  }

  @Override
  public void consultarSaldo() {
    System.out.println("Seu saldo atual é: R$ " + saldo + " e rende 13% ao ano.");
  }

  @Override
  public void depositar(double valor) {
    valor = valor * 0.99;
    saldo += valor;
    System.out.println("Você depositou: R$ " + valor + "seu novo saldo é de: R$ " + saldo);
  }
}

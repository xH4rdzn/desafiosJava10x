# Desafios Java10x - Banco Konoha
___

- Essa *Branch* está destinada para a resolução dos desafio propostos pelo curso de [Batismo de Java](https://batismodejava.dev/).
- O desafio consiste em:
  - Criar uma *interface* chamada **Conta** com os métodos `consultarSaldo()` e `depositar(double valor)`
  - Criar uma **classe abstrata** chamada *ContaBancaria* que implementa a interface **Conta**
  - Criar as classes *ContaCorrente* e *ContaPoupanca* que estende a classe *ContaBancaria*
  - Na classe *ContaPoupanca* o método `depositar(double valor)`, deve ter uma taxa de depósito (**1% do valor depositado**);

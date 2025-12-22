## Exercicio 1

1. Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
    - Consultar saldo
    - consultar cheque especial
    - Depositar dinheiro;
    - Sacar dinheiro;
    - Pagar um boleto.
    - Verificar se a conta está usando cheque especial.

Siga as seguintes regras para implementar
- A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
- O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
- Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
- Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
- Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

--------

## Diagrama UML 
````uml
class ContaBancaria {
- int numeroConta
- String titular
- double saldo
- double limiteChequeEspecial
- static final double TAXA_USO_CHEQUE_ESPECIAL = 0.20

        + ContaBancaria(int numeroConta, String titular, double depositoInicial)
        + double consultarSaldo()
        + double consultarLimiteChequeEspecial()
        + double consultarSaldoTotalDisponivel()
        + void depositar(double valor)
        + boolean sacar(double valor)
        + boolean pagarBoleto(double valor)
        + boolean isUsandoChequeEspecial()
        - void definirLimiteInicial(double depositoInicial)
    }
````

# Documentação da Classe ContaBancaria

## 1. Atributos (Estado da Classe)
Usamos o modificador `-` (private) para garantir o encapsulamento. O saldo e o limite não podem ser alterados diretamente por outras classes.

* `numeroConta` (**int**): Identificador da conta.
* `titular` (**String**): Nome do dono da conta.
* `saldo` (**double**): Armazena o valor atual. Pode ficar negativo se entrar no cheque especial.
* `limiteChequeEspecial` (**double**): O valor limite calculado na criação.
* `TAXA_USO_CHEQUE_ESPECIAL` (**static final double**): Constante de 20% (`0.2`). É `static` porque a taxa é a mesma para todas as contas e `final` porque não muda.

## 2. Construtor e Inicialização
* `+ ContaBancaria(...)`: O construtor público. Ele recebe o `depositoInicial`.
   * **Lógica interna:** Dentro do construtor, ele chamará o método privado `- definirLimiteInicial(depositoInicial)` para aplicar a regra dos R$ 500,00 e configurar o atributo `limiteChequeEspecial`.

## 3. Métodos de Operação (Comportamento)
Usamos o modificador `+` (public) para as operações que o usuário pode realizar.

* `consultarSaldo()`: Retorna apenas o saldo atual.
* `consultarLimiteChequeEspecial()`: Retorna o valor do limite configurado.
* `depositar(double valor)`: Recebe um valor para depósito.
   * **Lógica da Taxa:** Antes de somar o depósito, este método deve verificar internamente se `isUsandoChequeEspecial()` é verdadeiro. Se for, ele calcula 20% sobre o saldo negativo (o valor usado) e desconta do depósito (conforme a regra "assim que possível cobrar a taxa").
* `sacar(double valor)`: Retorna `boolean` (`true` se sucesso, `false` se sem fundos).
   * **Lógica:** Verifica se `valor <= (saldo + limiteChequeEspecial)`.
* `pagarBoleto(double valor)`: Funciona de forma idêntica ao sacar, mas semanticamente separado para atender ao requisito.
* `isUsandoChequeEspecial()`: Retorna `true` se `saldo < 0`.

## 4. Métodos Auxiliares (Internos)
Usamos o modificador `-` (private) para métodos que organizam o código interno, mas não devem ser acessados de fora.

* `definirLimiteInicial(double depositoInicial)`: Implementa a regra de negócio:
   * Se `depositoInicial <= 500`: limite = **50.0**.
   * Se `depositoInicial > 500`: limite = **depositoInicial * 0.5**.

---

### Notas sobre Padrões e Java

1.  **Encapsulamento:** Note que não criamos métodos `setSaldo` ou `setLimite`. Isso seria uma falha de segurança. O saldo só muda através de `depositar` ou `sacar`.
2.  **Tipagem:** Utilizei `double` para simplificar a leitura do diagrama, mas em um sistema bancário real, a boa prática é utilizar a classe `BigDecimal` para evitar erros de arredondamento de ponto flutuante.
3.  **Cardinalidade:** Como o exercício foca na estrutura da classe em si, a cardinalidade é implícita como **1** (uma instância representa uma conta). Se houvesse uma classe `Banco`, a relação seria `Banco 1 <>--- * ContaBancaria` (Agregação ou Composição).
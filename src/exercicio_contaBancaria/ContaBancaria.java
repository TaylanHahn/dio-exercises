package exercicio_contaBancaria;

public class ContaBancaria {
    // atributos privados
    private int numeroConta;
    private String titular;
    private double saldo;
    double limiteChequeEspecial;
    static final double TAXA_USO_CHEQUE_ESPECIAL = 0.2;

    // construtor
    public ContaBancaria(int numeroConta, String titular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = depositoInicial;
        this.definirLimiteInicial(depositoInicial);
    }

    // métodos
    public double consultarSaldo(){
        return this.saldo;
    }

    // CONSULTAR LIMITE CE
    public double consultarLimiteChequeEspecial(){
        return this.limiteChequeEspecial;
    }

    // CONSULTAR SALDO DISP
    public double consultarSaldoTotalDisponivel(){
        return this.saldo;
    }

    // DEPOSITAR
    public void depositar(double valor){
        if(isUsandoChequeEspecial()){
            double valorDevedor = Math.abs(this.saldo);
            double desconto = valorDevedor * 0.2;
            valor = valor - desconto;
        }
        this.saldo = this.saldo + valor;
    }

    // SACAR
    public boolean sacar(double valor){
        if(valor <= (this.saldo + this.limiteChequeEspecial)){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean pagarBoleto(double valor){
        if(valor <= (this.saldo + this.limiteChequeEspecial)){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean isUsandoChequeEspecial(){
        return this.saldo < 0;
    }

    private void definirLimiteInicial(double depositoInicial){
        if(depositoInicial <= 500){
            this.limiteChequeEspecial = 50.0;
        } else if(depositoInicial > 500){
            this.limiteChequeEspecial = depositoInicial * 0.5;
        } else {
            throw new RuntimeException("Erro ao definir limite inicial.");
        }
    }

    private void aplicarTaxaSeNecessario(){

    }



}

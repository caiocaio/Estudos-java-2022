package br.com.bytebank.banco.modelo;

public class ContaCorrente2 extends Conta implements Tributavel{


    //contrutores não são herdados, temos q reescrevelos na herança:
    public ContaCorrente2(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);

    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
public class ContaCorrente extends Conta {


    //contrutores não são herdados, temos q reescrevelos na herança:
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);

    }
}

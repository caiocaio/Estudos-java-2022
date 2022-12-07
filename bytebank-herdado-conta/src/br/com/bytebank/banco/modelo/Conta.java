package br.com.bytebank.banco.modelo;


/**
 * Classe representa a moldura de uma Conta
 *
 * @author Caio Marquez
 * @version 0.1
 *
 */

public abstract class Conta {
    protected  double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
    * Construtor para inicializar o objeto Conta a partir da agencia e numero.
    *
    * @param agencia
    * @param numero
    */
    
    public Conta(int agencia, int numero){
        Conta.total++;
       // System.out.println("total de contas e: " + total);
        this.agencia = agencia;
        this.numero = numero;
       // System.out.println("Estou criando uma conta " + numero);
    }
    
    /**
     * Depoisito de valor em conta
     * @param valor
     */
    public abstract void deposita(double valor);
    
    
    /**
     * Valor precisa ser maior que o saldo.
     * @param valor
     *
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor){
           //problema
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", " + "Valor: "+ valor);
        }

        this.saldo -=  valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }


    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if (numero <= 0){
            System.out.println("nao pode valor menor ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {

        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0 ){
            System.out.println("nao pode valor menor ou igual a zero");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}

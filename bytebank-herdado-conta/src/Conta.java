class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    //construtor padrão
//    public Conta(){
//
//    }

    //construtor especifico
    public Conta(int agencia, int numero){
        Conta.total++;
       // System.out.println("total de contas e: " + total);
        this.agencia = agencia;
        this.numero = numero;
       // System.out.println("Estou criando uma conta " + numero);
    }

    public void deposita(double valor){
        this.saldo +=  valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -=  valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saca(valor)){
            destino.deposita(valor);   //pode ser destino.saldo += valor;
            return true;
        } //else{} opicional aqui, por uma questão logica.
            return false;

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

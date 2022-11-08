class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

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
        if(this.saldo >= valor ){
            this.saldo -= saldo;
            destino.deposita(valor);   //pode ser destino.saldo += valor;
            return true;
        } //else{} opicional aqui, por uma questão logica.
            return false;

    }

}

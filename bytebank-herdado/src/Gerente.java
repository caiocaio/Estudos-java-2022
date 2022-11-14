public class Gerente extends Funcionario {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        //return this.senha == senha; -> pode ser assim

        if(this.senha == senha){
            return true;
        }else {
            return false;
        }
    }

    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario(); //usando o metodo da classe mãe
    }
}

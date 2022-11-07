public class testeReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; //nesse caso as duas referencias para o mesmo objeto
                                            //todo valor em uma vai vai ser o mesmo na outra

        System.out.println("saldo da Segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;

        System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
        System.out.println("saldo da Segunda conta: " + segundaConta.saldo);
    }
}

public class criarConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta seguntaConta = new Conta();
        seguntaConta.saldo = 50;

        System.out.println("Primeira conta tem: " + primeiraConta.saldo);
        System.out.println("Segunda conta tem: " + seguntaConta.saldo);
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(seguntaConta.agencia);

        seguntaConta.agencia = 146;
        System.out.println("agora a segunda conta esta na" +
                "agencia: " + seguntaConta.agencia);
    }
}

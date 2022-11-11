public class testaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta(22,33);

        System.out.println(conta.getNumero());

        Cliente caio = new Cliente();
        //conta.titular = caio;
        caio.setNome("Caio Marquez");

        conta.setTitular(caio);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        //agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

        //mesma coisa:
        System.out.println(titularDaConta);
        System.out.println(caio);
        System.out.println(conta.getTitular());

        System.out.println(Conta.getTotal());

    }
}

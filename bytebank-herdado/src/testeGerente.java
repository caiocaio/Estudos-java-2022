public class testeGerente {
    public static void main(String[] args) {

       Gerente gerente = new Gerente();


        Gerente g1 =   new Gerente();
        g1.setNome("Caio Marquez Chaves");
        g1.setCpf("826361672646");
        g1.setSalario(3000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);


        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }
}

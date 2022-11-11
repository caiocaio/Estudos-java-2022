public class testeFuncionario {
    public static void main(String[] args) {

        Funcionario caio = new Funcionario();

        caio.setNome("Caio Marquez Chaves");
        caio.setCpf("23422122333");
        caio.setSalario(8900.00);

        System.out.println(caio.getNome());
        System.out.println(caio.getBonificacao());

    }
}

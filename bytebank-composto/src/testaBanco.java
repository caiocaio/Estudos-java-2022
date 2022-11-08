public class testaBanco {

    public static void main(String[] args) {
        Cliente caio = new Cliente();
        caio.nome = "Caio";
        caio.cpf = "23433211245";
        caio.profissao = "pro";

        Conta contaDoCaio = new Conta();
        contaDoCaio.deposita(100);

        contaDoCaio.titular = caio;

        System.out.println(contaDoCaio.titular.nome);


    }
}

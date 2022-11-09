public class testaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDoCaio = new Conta();
        System.out.println(contaDoCaio.getSaldo());

        contaDoCaio.titular = new Cliente();
        System.out.println(contaDoCaio.titular);

        contaDoCaio.titular.nome = "Caio";
        System.out.println(contaDoCaio.titular.nome );

    }
}

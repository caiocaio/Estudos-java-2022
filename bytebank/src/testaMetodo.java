public class testaMetodo {
    public static void main(String[] args) {
        Conta contaDoCaio = new Conta();
        contaDoCaio.saldo = 100;

        contaDoCaio.deposita(50);

        System.out.println(contaDoCaio.saldo);

        boolean conseguiuRetirar = contaDoCaio.saca(130);

        System.out.println(contaDoCaio.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaAnna  = new Conta();
        contaDaAnna.deposita(1000);

        contaDaAnna.transfere(300, contaDoCaio);

        System.out.println(contaDoCaio.saldo);

    }
}

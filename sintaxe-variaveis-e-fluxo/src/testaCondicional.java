public class testaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");
        int idade = 16;
        int quantidadePessoas = 4;
        if(idade >= 18){
            System.out.println("vc tem mais de 18 anos");
            System.out.println("Seja bem vindo");
        }else {
            if (quantidadePessoas >= 2){
                System.out.println("vc n tem 18, mas está " +
                        "acompanhado então pode entrar");
            }
            System.out.println("infelizmente não pode entrar");
        }
    }
}

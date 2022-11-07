public class testaEscopo {

    public static void main(String[] args) {
        System.out.println("Testando Condicionais");
        int idade = 16;
        int quantidadePessoas = 1;

        boolean acompanhado;

        //boolean acompanhado = quantidadePessoas >= 2;
        if (quantidadePessoas >= 2 ){
           acompanhado = true;
        }else {
            acompanhado = false;
        }


        if(idade >= 18 || acompanhado  ){    // || é "ou" e && é "e"
            System.out.println("Seja bem vindo");
        }else{
            System.out.println("infelizmente não pode entrar");
        }
    }
}

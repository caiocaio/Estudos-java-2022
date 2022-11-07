public class TestaPontoFlutuante {

    public static void main(String[] args) {

        double salario;
        salario = 1250.70;
        System.out.println("meu salário é " + salario);

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        int outraDivisao = 5 / 2;
        System.out.println(outraDivisao);

        double novaTentativa = 5 / 2; //vai dar problema pq o java lê da direita pra esquerda, pegou dois int e fez a conta
        System.out.println(novaTentativa);

        double certaTentativa = 5.0 / 2; // aqui deu certo pq um dos numeros é inteiro
        System.out.println(certaTentativa);
    }

}

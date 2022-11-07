public class testaConversao {

    public static void main(String[] args) {
       // double salario = 1270.50;
       // int valor = salario; não consegue converter pois é um valor não inteiro indo para uma variavel inteira

        double salario = 1270.50;
        int valor = (int) salario; //fazendo assim ele mostra só a parte inteira do numero
        System.out.println(valor);

        long numeroGrande = 12311242131l;

    }
}

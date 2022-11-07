public class desafioFatorial {
    public static void main(String[] args) {

        int fatorial = 1;
        for (int n = 1; n <= 10 ; n++ ){
            fatorial *= n;    // fatorial = fatorial * n;
            System.out.println(fatorial);
        }

//        for (int n = 1; n <= 10 ; n++ ){
//            for (int f = 1; f <= n  ; f++){
//                int resultado = f * n;
//                int fatorial = resultado * f;
//                System.out.println(fatorial);
//            }
//        }
//        int fatorial = 1;
//        for (int i = 1; i < 11; i++) {
//            fatorial *= i;
//            System.out.println("Fatorial de " + i + " = " + fatorial);
//        }

    }
}

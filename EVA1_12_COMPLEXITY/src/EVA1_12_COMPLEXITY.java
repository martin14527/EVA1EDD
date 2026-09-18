public class EVA1_12_COMPLEXITY {

    public static void main(String[] args) {

        // ALGORITMO 1
int numero = 60;

 for (int i = 2; i <= numero - 1; i++) {

            if (numero % i == 0) {
                System.out.println("No es primo");
                break;
            }
        }
        // ALGORITMO 2
        int numero2 = 60;

        for (int i = 2; i <= Math.sqrt(numero2); i++) {

            if (numero2 % i == 0) {
                System.out.println("No es primoooooooooooooooooooooooo");
                break;
            }
        }
    }
}
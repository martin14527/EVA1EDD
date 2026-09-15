
package eva1_9_matrices;

public class EVA1_9_MATRICES {

    public static void main(String[] args) {

        int[][] matriz1 = new int[5][3];

        System.out.print("matriz = " + matriz1);
        System.out.print("matriz.length = " + matriz1.length);
        System.out.print("matriz[0] = " + matriz1[1]);
        System.out.print("matriz[0].length = " + matriz1[1].length);

        for (int i = 0; i < matriz1.length; i++) { //i controla las filas

            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("[" + matriz1[i][j] + "]"); //J controla las columnas
            }

            System.out.print("");
        }
    }
}
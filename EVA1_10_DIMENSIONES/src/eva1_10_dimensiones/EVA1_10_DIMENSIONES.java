package eva1_10_dimensiones;

public class EVA1_10_DIMENSIONES {

    public static void main(String[] args) {
        // Arreglo de 4 dimensiones (2x2x2x2 = 16 elementos en total)
        int[][][][] arreglo = new int[2][2][2][2];
        // 2. Imprimir los valores almacenados
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo[i][j].length; k++) {
                    for (int l = 0; l < arreglo[i][j][k].length; l++) {
                        System.out.println("arreglo[" + i + "][" + j + "][" + k + "][" + l + "] = " + arreglo[i][j][k][l]);
                    }
                }
            }
        }
    }
}
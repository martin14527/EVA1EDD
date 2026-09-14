package eva1_7_arreglos_size;

public class EVA1_7_ARREGLOS_SIZE {
    public static void main(String[] args) {   
        int[] original = new int[10];
        for (int i = 0; i < original.length; i++) {
            original[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i] + "j");
        }        
        System.out.println(""); // no puedes cambiar el tamaño
        //respaldo "creas una copia igual" 
        int[] respaldo = new int[5];
        for (int i = 0; i < respaldo.length; i++) {
        respaldo[i] = original[i];}
        original = new int[5];
        for (int p = 0; p < original.length; p++) {
            //se simula el arreglo fue cambiado.
            
            System.out.println(original[p]);
        }}}
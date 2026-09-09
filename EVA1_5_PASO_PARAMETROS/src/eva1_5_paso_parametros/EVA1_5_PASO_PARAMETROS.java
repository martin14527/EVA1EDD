
package eva1_5_paso_parametros; //paso x valor y x referencia.
public class EVA1_5_PASO_PARAMETROS {                                                   
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);
      System.out.println("valor de 1" + 1);
      increment(i);
       System.out.println("valor de 1 (despues de incrementar = " + i);
       prueba prueba = new prueba();
       System.out.println("valor de prueba (despues de incrementar) =" + prueba.y);
    }
    public static void increment(int valor){                          
    valor++;
    }
    public static void incrementarob (prueba objeto){
    objeto.y++;
   }
}
class prueba {
int y=5;
}
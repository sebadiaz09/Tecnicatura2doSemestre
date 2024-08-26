
package CicloWhile;

/**
 *
 * @author Seba
 */
public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0; // Inferencia de tipos
        while(conteo <= 7){
            System.out.println("conteo = " + conteo);
            conteo++; // Vamos aumentando en uno la variable
        }
        
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 7);
    }
    
}

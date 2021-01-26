/*
 * and open the template in the editor.
 */
package t02ex07;

/**
 * @author rodo
 */
public class T02ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Rodolfo";
        System.out.println("Longitud de mi nombre: "+ nombre.length());
        System.out.println("Mi nombre en mayusculas: "+nombre.toUpperCase());
        System.out.println("Cambiamos la o por la u en mi nombre: "+ nombre.replace('o','u'));
    }
    
}

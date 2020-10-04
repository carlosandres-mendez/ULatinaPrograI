
import java.util.Scanner;

/**
 * @author carlosandres.mendez
 * Este ejemplo muestra como podemos encapsular codigo 
 * Las clases se componen de propiedades (variables globales) y métodos (funciones).
 * Algunas propiedades pueden ser publicas o privadas. Las propieades y métodos publicos seran parte de la interfaz (API), 
 * para reutilizar codigo el día de mañana en otros programas que programemos.
 * El metodo main, es un método especial donde se inicia la ejecucion del programa.
 * Cade destacar la funcion sumaTotal() retorna un valor de tipo int
*/
public class EscanerConContexto {

    public static int elNumUsuarioDigita1,
            elNumUsuarioDigita2;

    private static int sumaTotal;

    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        elNumUsuarioDigita1 = miEscaner.nextInt();
        elNumUsuarioDigita2 = miEscaner.nextInt();
        sumaTotal = sumaTotal();
        System.out.println(sumaTotal);
    }

    public static int sumaTotal() {
        return elNumUsuarioDigita1 + elNumUsuarioDigita2;
    }
}

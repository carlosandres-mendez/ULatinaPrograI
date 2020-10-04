
/**
 *
 * @author carlosandres.mendez
 */
public class ImprimeUnos {
    
    public static void main(String[] args) {
        
		//Esta es una manera de hacer un ciclo
        for(int i=0;i<1000;i++){
            System.out.println(1);
        }
        
		//Esta es otra manera de hacer un ciclo (son equivalentes)
        int i=0;
        while(i<1000){
            System.out.println(1);
            i++; //esto es equivalente a: i = i + 1;
        }
        
    }
}

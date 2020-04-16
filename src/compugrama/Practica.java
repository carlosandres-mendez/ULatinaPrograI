package compugrama;


public class Practica {

    public static void main(String args[]) {
        int n = 10;
        int m = 10;
        String str = "*";
        
        
        for (int i = 1; i <= n; i++) {
        
            for (int j = 1; j <= m; j++) {
                System.out.print(str); 
            }
        
            System.out.println();
        }

    }
}


/*

         for (int j = 1; j <= n - i; j++) {
                System.out.print("_");
            }
            for (int h = 1; h <= n; h++) {
                if (h == 1 || i == n || h == n || i == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");


*/
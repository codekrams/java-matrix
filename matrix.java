
package schleifeinschleife;


public class SchleifeInSchleife {
    public static void main(String[] args) {
        
        for (int i= 1; i<11; i++){
            for (int j=1; j<=10; j++){
                int einmaleins = i*j;
                if(i==1){
                    System.out.print(einmaleins + " ");
                }
                
                if (i==2) {
                    System.out.print(einmaleins + " "); 
                }
                if (i==3) {
                    System.out.print(einmaleins + " ");  
                }
               if (i==4) {
                    System.out.print(einmaleins + " ");
                }
                if (i==5) {
                    System.out.print(einmaleins + " ");  
                }
                if (i==6) {
                    System.out.print(einmaleins + " ");  
                }
                if (i==7) {
                    System.out.print(einmaleins + " ");  
                }
                if (i==8) {
                    System.out.print(einmaleins + " ");  
                }
                if (i==9) {
                    System.out.print(einmaleins + " ");  
                }
                if (i==10) {
                    System.out.print(einmaleins + " ");  
                }
            }
            System.out.println("");
        }
    }
}

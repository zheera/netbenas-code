package lab;
import java.util.Scanner;

public class Lab {
//    lera drusty akait u code anusit la xwarawash bamngy akaytawa 
    
     int array[][]=new int[3][4];    
public void lab(){
    
     Scanner zh=new Scanner(System.in);
      
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                 System.out.println(" enter number");
                array[i][j]=zh.nextInt();

            } 
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                        System.out.print("  "+array[i][j]);
    }     System.out.println("  ");
    
}  
}

    
    public static void main(String[] args) { // lera bangy akaytawa 
Lab ob=new Lab();
ob.lab();
    
    }
     
}

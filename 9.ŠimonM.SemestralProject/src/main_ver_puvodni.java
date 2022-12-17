//@author marts
import java.util.Scanner;

public class main_ver_puvodni {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean endProgram=false;
        while(endProgram==false){
            System.out.println("Pokracovat ve zpracovani (a/n):");
            String inRozhodnuti= sc.nextLine();
            if(inRozhodnuti.equals("a") || inRozhodnuti.equals("A")){
            //hlavni fce
            
            
            
            
            
            }
            else if(inRozhodnuti.equals("n") || inRozhodnuti.equals("N")){
                System.out.println("Ukončuji program");
                endProgram=true;
            }
            else{
                System.out.println("Nezadal jste správný parametr");
                System.out.println("Zkuste akci opakovat znovu");
            }
        }    
    }
}
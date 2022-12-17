
//@author marts
import java.util.Scanner;


public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean endProgram=false; //boolean pro ukonceni programu

        while(endProgram==false){ //while ve kterém probiha cela fce
            System.out.println("Pokracovat ve zpracovani (a/n):");
            String inRozhodnuti= sc.nextLine();//input uzivatele
            switch (inRozhodnuti) { //switch na zaklade inputu
                case "a", "A" -> {
                    //hlavni fce
                    double primka[][]=tools.InputPrimky();
                    double souradnice[][]=tools.InputSouradnic();
                    double vypis[][]=tools.SortSouradnic(souradnice, primka);
                    //vypis souradnic (promena "vypis)
                    
                    
                    
                    
                }
                case "n", "N" -> {
                    System.out.println("Ukončuji program");
                    endProgram=true;
                }
                default -> {
                    System.out.println("Nezadal jste správný parametr");
                    System.out.println("Zkuste akci opakovat znovu");
                }
            }
        }
        System.out.println("Program ukončen");
    }
}
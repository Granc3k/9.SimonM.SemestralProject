import java.util.Scanner;

/**
 * 9. Program sorts inputed points based on distance between inputed points and
 * inputed line
 * 
 * @author marts
 * @version 1.0 15/12/22
 */

public class main_ver_if {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean endProgram = false;
        while (endProgram == false) { // while where whole program operates
            System.out.println("Pokracovat ve zpracovani (a/n):");
            String inRozhodnuti = sc.nextLine(); // user input of choice for continuing/stopping
            if (inRozhodnuti.equals("a") || inRozhodnuti.equals("A")) { // if for continue
                // main function
                double[][] primka = tools.InputPrimky(); // input for line
                double[][] souradnice = tools.InputSouradnic(); // input for points
                double[][] vypis = tools.SortSouradnic(souradnice, primka); // sorts points
                tools.vypisSouradnic(vypis); // print

            } else if (inRozhodnuti.equals("n") || inRozhodnuti.equals("N")) { // if for stop
                // program stops
                System.out.println("Ukoncuji program...");
                endProgram = true;
            } else { // invalid input
                // invalid input for continuing/stopping program
                System.out.println("Nezadal jste spravny parametr");
                System.out.println("Zkuste akci opakovat znovu");
            }
        }
        System.out.println("Program ukoncen");
    }
}
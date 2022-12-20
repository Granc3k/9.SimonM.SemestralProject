import java.util.Scanner;

public class UI {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadejte jaky program chcete pustit program.");
        System.out.println("1 pro spusteni vanocni ulohy");
        System.out.println("2 pro spusteni semestralni prace");
        System.out.println("0 pro ukonceni programu.");
        boolean spustSe = true;
        while (spustSe) {
            int vyber = sc.nextInt();
            switch (vyber) {
                case 1 -> {
                    System.out.println("Spoustim vanocni ulohu");
                    christmasSimon.christmasProject(args);
                }
                case 2 -> {
                    System.out.println("Spoustim semestralni praci");
                    main_ver_if.SemestralProjectIf(args);
                }
                case 0 -> {
                    System.out.println("Ukoncuji program");
                    spustSe = false;
                }
                default -> {
                    System.out.println("Nezadal si spravny parametr");
                    System.out.println("Znovu a lepe...");
                }
            }
        }
    }
}
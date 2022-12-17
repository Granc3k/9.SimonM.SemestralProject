import java.util.Scanner;
import java.util.Arrays;

public class tools {
    static Scanner sc = new Scanner(System.in);

    public static double[][] InputPrimky() {
        System.out.println("Zadej body primky:");
        // vezme body primky
        double[][] a = new double[3][2];
        for (int i = 0; i < 2; i++) {
            a[i][0] = sc.nextDouble();
            a[i][1] = sc.nextDouble();
        }
        a[2][0] = a[0][0] - a[1][0]; // ax
        a[2][1] = a[0][1] - a[0][1]; // y
        return a;
    }

    public static double[][] InputSouradnic() {
        // vezme input od uzivatele a da jej do pole "input X 2"

        System.out.println("Zadejte pocet bodu:");
        int pointCount = sc.nextInt();
        double[][] inputVys = new double[pointCount][3];

        System.out.println("Zadejte souradnice bodu:");
        for (int i = 0; i < pointCount; i++) {
            inputVys[i][0] = sc.nextDouble();
            inputVys[i][1] = sc.nextDouble();
        }
        return inputVys;
    }

    public static double[][] SortSouradnic(double[][] souradnice, double[][] primka) {
        // provede sort v zadanych bodech
        double[][] sortVypis = new double[souradnice.length][souradnice[0].length - 1];
        double[] vypocet = new double[souradnice.length];
        double a = primka[2][0];
        double b = primka[2][1];
        double c = 0;
        for (int i = 0; i < souradnice.length; i++) {
            // vypocet vzdalenosti bodu od primky a importovani do tretiho sloupce
            double a1 = souradnice[i][0];
            double a2 = souradnice[i][1];
            double v;
            if (a == 0 && a1 == 0) {// kdyz x=0 a bod je na ose y
                v = 0;
            }
            if (b == 0 && a2 == 0) {// kdyz y=0 a bod je na ose x
                v = 0;
            } else {// promenne do vzorce
                v = Math.abs(a * a1 + b * a2 + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            }
            vypocet[i] = v;
            souradnice[i][2] = v;
        }

        Arrays.sort(vypocet);
        // serazeni vysledku
        for (int i = 0; i < vypocet.length; i++) {// projede celou puvodni matici
            double temp = vypocet[i];
            for (int ii = 0; ii < souradnice.length; ii++) {
                if (temp == souradnice[ii][2]) {
                    sortVypis[i][0] = souradnice[ii][0];
                    sortVypis[i][1] = souradnice[ii][1];
                    souradnice[ii][2] = 42069;
                    break;
                }
            }
        }
        return sortVypis;
    }

    public static void vypisSouradnic(double[][] matrix) {
        System.out.println("Setridene body:");
        for (int i = 0; i < matrix.length; i++) {
            String temp = "";
            for (int ii = 0; ii < matrix[i].length; ii++) {
                temp = temp + matrix[i][ii] + " ";
            }
            System.out.println(temp);
        }
    }
}

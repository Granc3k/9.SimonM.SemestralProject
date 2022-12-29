import java.util.Scanner;
import java.util.Arrays;

public class tools {
    static Scanner sc = new Scanner(System.in);

    public static double[] InputPrimky() {
        double ax, by, x, y;
        double[] primka = new double[3];
        System.out.println("Zadej body primky:");
        // vezme body primky
        double[][] a = new double[2][2];
        for (int i = 0; i < 2; i++) {
            a[i][0] = sc.nextDouble();
            a[i][1] = sc.nextDouble();
        }
        if (a[0][0] > a[1][0]) {
            x = a[0][0];
            y = a[0][1];
            ax = a[0][0] - a[1][0]; // ax
            by = a[0][1] - a[1][1]; // by
        } else {
            x = a[1][0];
            y = a[1][1];
            ax = a[1][0] - a[0][0]; // ax
            by = a[1][1] - a[0][1]; // by
        }
        double c = -(ax * x) - (by * y);
        primka[0] = ax;
        primka[1] = by;
        primka[2] = c;
        return primka;
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

    public static double[][] SortSouradnic(double[][] body, double[] primka) {
        // provede sort v zadanych bodech
        double[][] sortVypis = new double[body.length][body[0].length - 1];
        double[] vypocet = new double[body.length];
        double a = primka[0];
        double b = primka[1];
        double c = primka[2];
        for (int i = 0; i < body.length; i++) {
            // vypocet vzdalenosti bodu od primky a importovani do tretiho sloupce
            double a1 = body[i][0];
            double a2 = body[i][1];
            double v;// promenne do vzorce
            v = Math.abs(a * a1 + b * a2 + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            vypocet[i] = v;
            body[i][2] = v;
        }

        Arrays.sort(vypocet);
        /*
         * double maxTemp=0;
         * double temp=0;
         * for(int i=0;i<vypocet.length;i++){
         * if(vypocet[i]>vypocet[i+1]){
         * temp=vypocet[i];
         * vypocet[i]=vypocet[i+1];
         * vypocet[i+1]=temp;
         * i=0;
         * }
         * }
         */

        // serazeni vysledku
        for (int i = 0; i < vypocet.length; i++) {// projede celou puvodni matici
            double temp = vypocet[i];
            for (int ii = 0; ii < body.length; ii++) {
                if (temp == body[ii][2]) {
                    sortVypis[i][0] = body[ii][0];
                    sortVypis[i][1] = body[ii][1];
                    body[ii][2] = 42069;
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

import java.util.Scanner;
import java.util.Arrays;

public class tools {
    static Scanner sc = new Scanner(System.in);

    public static double[][] InputPrimky() {
        double ax, by, x, y;
        System.out.println("Zadej body primky:");
        // vezme body primky
        double[][] primka = new double[3][3];
        for (int i = 0; i < 2; i++) {
            primka[i][0] = sc.nextDouble();
            primka[i][1] = sc.nextDouble();
        }
        if (primka[0][0] > primka[1][0]) {
            x = primka[0][0];
            y = primka[0][1];
            ax = primka[0][0] - primka[1][0]; // ax
            by = primka[0][1] - primka[1][1]; // by
        } else {
            x = primka[1][0];
            y = primka[1][1];
            ax = primka[1][0] - primka[0][0]; // ax
            by = primka[1][1] - primka[0][1]; // by
        }
        double c = -(ax * x) - (by * y);
        primka[2][0] = ax;
        primka[2][1] = by;
        primka[2][2] = c;
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

    public static double[][] SortSouradnic(double[][] body, double[][] primka) {
        // provede sort v zadanych bodech
        double[][] sortVypis = new double[body.length][body[0].length - 1];
        double[] vypocet = new double[body.length];
        double a = primka[2][0];
        double b = primka[2][1];
        double c = primka[2][2];
        for (int i = 0; i < body.length; i++) {
            // vypocet vzdalenosti bodu od primky a importovani do tretiho sloupce
            double a1 = body[i][0];
            double a2 = body[i][1];
            double v;// promenne do vzorce
            if (a == 0 && a1 == 0) {
                v = 0;
            } else if (b == 0 && a2 == 0) {
                v = 0;
            } else {
                v = Math.abs(a * a1 + b * a2 + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            }
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

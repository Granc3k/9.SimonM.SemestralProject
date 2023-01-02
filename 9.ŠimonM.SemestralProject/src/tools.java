import java.util.Scanner;

public class tools {
    static Scanner sc = new Scanner(System.in);

    public static double[][] inputPrimky() {
        /**
         * input of a line by 2 points
         */
        System.out.println("Zadej body primky:");
        double[][] primka = new double[2][2];
        for (int i = 0; i < 2; i++) {
            primka[i][0] = sc.nextDouble();
            primka[i][1] = sc.nextDouble();
        }
        return primka;
    }

    public static double[] vypocetRcePrimky(double[][] primka) {
        /**
         * calculation of an normal equation of line
         * "ax+by+c=0"
         */
        double[] rce = new double[3];
        double a, b, x, y;
        if (primka[0][0] > primka[1][0]) { // 1. point is more right on axis X then 2. point
            x = primka[0][0];
            y = primka[0][1];
            a = primka[0][0] - primka[1][0]; // ax
            b = primka[0][1] - primka[1][1]; // by
        } else {
            x = primka[1][0];
            y = primka[1][1];
            a = primka[1][0] - primka[0][0]; // ax
            b = primka[1][1] - primka[0][1]; // by
        }
        double c = -(a * x) - (b * y);
        rce[0] = a;
        rce[1] = b;
        rce[2] = c;
        return rce;
    }

    public static double[][] inputSouradnic() {
        /**
         * method for input of points that user want to sort
         */
        System.out.println("Zadejte pocet bodu:");
        int pointCount = sc.nextInt();
        double[][] body = new double[pointCount][3];

        System.out.println("Zadejte souradnice bodu:");
        for (int i = 0; i < pointCount; i++) {
            body[i][0] = sc.nextDouble();
            body[i][1] = sc.nextDouble();
        }
        return body;
    }

    public static double[][] vypocetVzdalenosti(double[][] body, double[] rce) {
        /**
         * method for calculation of a distance between points and line
         */
        double a = rce[0];
        double b = rce[1];
        double c = rce[2];
        for (int i = 0; i < body.length; i++) {
            double a1 = body[i][0];
            double a2 = body[i][1];
            double v; // variables for equation
            if (a == 0 && a1 == 0) {
                v = 0;
            } else if (b == 0 && a2 == 0) {
                v = 0;
            } else { // equation
                v = Math.abs(a * a1 + b * a2 + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            }
            body[i][2] = v;
        }
        return body;
    }

    public static double[][] sortVzdalenosti(double[][] body) {
        /**
         * method that sorts inputed 2D array via bubble sort
         */
        double[] tempPole = new double[2];
        for (int i = 0; i < body.length; i++) {
            for (int j = 1; j < (body.length - i); j++) {
                if (body[j - 1][2] > body[j][2]) {
                    tempPole = body[j - 1];
                    body[j - 1] = body[j];
                    body[j] = tempPole;
                }
            }
        }
        return body;
    }

    public static void vypisSouradnic(double[][] matrix) {
        /**
         * method that prints out sorted 2D array
         */
        System.out.println("Setridene body:");
        for (int i = 0; i < matrix.length; i++) {
            String temp = "";
            for (int ii = 0; ii < matrix[i].length - 1; ii++) { /**
                                                                 * can print out even the distance; change
                                                                 * "matrix[i].length-1" to "matrix[i].length"
                                                                 */
                temp = temp + matrix[i][ii] + " ";
            }
            System.out.println(temp);
        }
    }
}
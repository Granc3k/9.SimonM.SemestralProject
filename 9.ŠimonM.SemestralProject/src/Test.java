public class Test {

    public static void main(String[] args) {
        /*
         * double[] kokos = tools.InputPrimky();
         * double[][] souradnice = { { 10.32, 0, 0 }, { -3, -8, 0 }, { 15, 20, 0 }, { 1,
         * 0, 0 } };
         * double[][] vypis = tools.SortSouradnic(souradnice, kokos);
         * 
         * for (int i = 0; i < vypis.length; i++) {
         * for (int ii = 0; ii < vypis[i].length; ii++) {
         * System.out.print(vypis[i][ii] + " ");
         * 
         * }
         * System.out.println();
         * }
         */
        double[] vypocet = { 0, 1, 3, 5.5, 6, 8, 6 };
        double temp = 0;
        for (int i = 0; i < vypocet.length; i++) {
            if ((i + 1) != vypocet.length && vypocet[i] > vypocet[i + 1]) {
                temp = vypocet[i];
                vypocet[i] = vypocet[i + 1];
                vypocet[i + 1] = temp;
                i = 0;
            }
        }
        System.out.println("sort dokončen");
        System.out.println(vypocet);
    }

}

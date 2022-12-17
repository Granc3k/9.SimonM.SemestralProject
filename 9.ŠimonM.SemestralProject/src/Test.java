public class Test {

    public static void main(String[] args) {
        double[][] kokos = { { 1, 0 }, { -1, 0 }, { 1, 0 } };
        double[][] souradnice = { { 10.32, 0, 0 }, { -3, -8, 0 }, { 15, 20, 0 }, { 1, 0, 0 } };
        double[][] vypis = tools.SortSouradnic(souradnice, kokos);

        for (int i = 0; i < vypis.length; i++) {
            for (int ii = 0; ii < vypis[i].length; ii++) {
                System.out.print(vypis[i][ii] + " ");

            }
            System.out.println();
        }

    }

}

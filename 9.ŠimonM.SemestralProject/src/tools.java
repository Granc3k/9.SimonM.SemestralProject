import java.util.Scanner;

public class tools {
    static Scanner sc = new Scanner(System.in);
    
    public static double[][] InputPrimky(){
        //vezme body primky
        double[][] a = new double[3][2];
        for (int i=0;i<2;i++){
            a[i][0]=sc.nextDouble();
            a[i][1]=sc.nextDouble();
        }
        return a;
    }
    
    public static double[][] InputSouradnic(){
        //vezme input od uzivatele a da jej do pole "input X 2"
        
        System.out.println("Zadejte pocet bodu:");
        int pointCount=sc.nextInt();
        double[][] inputVys=new double [pointCount][3];
        
        System.out.println("Zadejte souradnice bodu:");
        for (int i=0;i<=pointCount;i++){
            inputVys[i][0]=sc.nextDouble();
            inputVys[i][1]=sc.nextDouble();
        }
        return inputVys;
    }
    
    public static double[][] SortSouradnic(double[][] souradnice,double[][] primka){
        //provede sort v zadanych bodech
        double[][] sort_vypi=new double[][];

        
        
        for(int i=0;i<=souradnice.length;i++){ 
        //vypocet vzdalenosti bodu od primky a importovani do tretiho sloupce
            double v=Math.abs(primka[2][0]*souradnice[i][0]+primka[2][1]*souradnice[i][1]+primka[][])/Math.sqrt(Math.pow(primka[2][0],2)+Math.pow(primka[2][1],2));
        
        
        
        
        }
        
        return sort_vypis;
    }
    
}

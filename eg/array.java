package eg;

import java.lang.reflect.Array;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        int a= 10;
        String s= "Test";
        Double d = 623.43;
 /*
       double[] twoAnswers = Element();

       for (double abc:twoAnswers){
           System.out.println(abc);
       }
   */
//      foods();

      Kim(5,d,"fkd");
      Kim(a,d,s);

    }

    public static int[] values() {

        int[] number = new int[6];
        number[0] = 1;
        number[1] = 2;
        number[2] = 43;
        number[3] = 34;
        number[4] = 4;
        number[5] = 322;


        return number;
    }

    public static void ArrayPrint() {
        int[] array = new int[]{1, 2, 2, 3, 3, 3, 4, 4, 55, 44, 5, 5,};

        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            flag = true;
            System.out.println(array[i]);
        }
        System.out.println("****************\n");


        for (int j = array.length - 1; j >= 0; j--) {


            System.out.println(array[j]);
        }
    }

    public static double[] Element() {

        double[] a = new double[5];
        a[0] = 12.22;
        a[1] = 12.54;
        a[2] = 11.22;
        a[3] = 12.43;
        a[4] = 10.11;


        double[] sum = new double[2];
        sum[0] = 0;
        sum[1] = 1;

        for (int i = 0; i < a.length; i++) {

            sum[0] =sum[0] + a[i];            //TO find sum

            sum[1] = sum[0]/a.length;         //To find an average
        }
//        System.out.println(sum);
//
//        System.out.println(avg);

        return sum;
    }
    public static void foods(){

        Scanner sc = new Scanner(System.in);


        String[] fav = new String[3];
        System.out.println("Please specify your favourite foods: ");


        for (int i=0; i<fav.length; i++){
            fav[i] = sc.nextLine();

        }
        System.out.println("No more foods!"+"\n");

        System.out.println("*******************");

        System.out.println("Your favourite foods are");

        for (int i=0; i<fav.length; i++){
            System.out.println(fav[i]);
        }
    }
    public static void Kim(int a,double l, String r){

        System.out.println(a+l+r);
    }
}

package eg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example {
    public static void main(String[] args) {

        String abc = null;
        String gfg = "abc";

        try {
            if (gfg.equals(abc)) {
                System.out.println("Same");
            } else
                System.out.println("Not same");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
//        example obj = new example();
//        int ans =obj.array();
//        System.out.println(ans);
        array();
        List();
    }

    public static void array() {

//        int[] a = new int[4];
//        a[0] = 100;
//        a[1] = 200;
//        a[2] = 300;
//        a[3] = 400;
////        return a[3];
//        System.out.println(a[2]);
//
//        int[] arr = {1,2,3,4,5};
//        for (int i=1;i<a.length;i++){
//            System.out.println(a[i]);
//        }

//        String[] words = {"Raman","Shyam","Rajesh","Ghanshyam"};
//        for ( String s: words){
//            System.out.println(s);
//        }
        int[] num = {1, 2, 3, 4, 5, 6, 8, 10, 12, 14};
        for (int number : num) {
            if (number % 2 == 0) {
                System.out.println(number);
            } else
                System.out.println(number + " is Not divisible by 2");
        }

    }

    public static void List() {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(32);
        num.add(43);
        num.remove(1);
        System.out.println(num.get(1));

        ArrayList<String> name = new ArrayList<String>();
        name.add("Raju");
        name.add("Karan");
        name.add("Tina");
        for (int i=0; i<name.size();i++){
            System.out.println(name.get(i));
        }
        System.out.println("********************");

        for (String s : name) {
            System.out.println(s);
        }
        String[] Fruits = {"Apple","Grapes","Guava","Orange"};
        List<String> FruitsArray= Arrays.asList(Fruits);
        System.out.println(FruitsArray.contains("Guava"));
    }
}

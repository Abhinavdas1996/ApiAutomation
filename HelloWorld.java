import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String s1="Rahul Shetty Academy";
        String[] splittedArray =  s1.split(" ");
        System.out.println(splittedArray[0]);

        for (int i=0; i<splittedArray.length; i++){
            System.out.println(splittedArray[i]);
        }
        System.out.println("* * * * * ** *********");

        for (int i=0; i<s1.length(); i++){
            System.out.println(s1.charAt(i));
        }
        System.out.println("***** ****** ****** ****** ****");

        for (int i=s1.length()-1; i>=0; i--){
            System.out.println(s1.charAt(i));
        }
    }
}

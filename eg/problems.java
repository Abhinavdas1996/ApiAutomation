package eg;

public class problems {
    public static void main(String[] args) {


        double[] num = new double[]{1.1, 2.2, 3.02, 4.2, 5.4};

        for (double k : num){
            System.out.println(k);
        }
        System.out.println("\n");

        String[] names = new String[]{"Ram", "Shyam", "Simran"};


        for (String n : names) {
            System.out.println(n);
        }
        System.out.println("\n");

        String[] codes = new String[2];
        codes[0] = "Apple fruit";
        codes[1] = "Grapes a b c";

        for (String c : codes){
            System.out.println(c);
        }
    }
}

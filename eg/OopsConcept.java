package eg;

public class OopsConcept {
    public static void main(String[] args) {

        OopCalls abc = new OopCalls();
        OopCalls test = new OopCalls();

        abc.num = 5;
        abc.word ="Abhinav";
        abc.decimal = 10.34;

        System.out.println(abc.num+ abc.decimal+ abc.word);

        test.num= 6;
        System.out.println(test.num);

        abc.foo();

    }
}

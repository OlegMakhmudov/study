//public class Lambda1 {
//    @FunctionalInterface
//    public interface testInterface {
//        boolean myMethod(long number);
//    }
//
//    @FunctionalInterface
//    public interface text {
//        String myText(String o1, String o2);
//
//    }
//
//    public static void main(String[] args) {
//        testInterface check = x -> (x % 13) == 0;
//        System.out.println(check.myMethod(13));
//        System.out.println(check.myMethod(20));
//
//        testInterface positive = x -> x > 0;
//        System.out.println(positive.myMethod(3));
//        System.out.println(positive.myMethod(-5));
//
//        text textLength = s -> s;
//        System.out.println(textLength.myText("Cnhjrf"));
//
//    }
















//    @FunctionalInterface
//    public interface MyFunctionalInterface {
//
//        boolean myMethod(long number);
//
//    }
//    public static void main(String[] args) {
//        MyFunctionalInterface withoutRest = x -> (x % 13) == 0;
//        System.out.println(withoutRest.myMethod(14));
//        System.out.println(withoutRest.myMethod(20));
//        System.out.println();
//
//        MyFunctionalInterface positive = x -> x > 0;
//        System.out.println(positive.myMethod(0));
//        System.out.println(positive.myMethod(-5));
//        System.out.println();
//
//    }


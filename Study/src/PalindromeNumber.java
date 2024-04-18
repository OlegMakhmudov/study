//import java.util.Arrays;
//import java.util.HashMap;
//
//public class PalindromeNumber {
//    public static boolean isPalindrome(int x) {
//
//        if (x < 0) {
//            return false;
//        }
//
//        String s = x + ""; // получаем s из х
//        StringBuilder sb = new StringBuilder(s); //Создаем StringBuilder (чтобы использовать функцию reverse) и присваиваем ему s, который из х получили
//
//        return sb.reverse().toString().equals(s);// проверка если 321 = 123 то false, если 121 = 121 то true
//    }
//
//
//    public static void main(String[] args) {
//        PalindromeNumber palindromeNumber = new PalindromeNumber();
//        HashMap
//        double start = System.nanoTime()/1000000000;
//        for(int x = 0; x <= 10000000; x++) {
//            palindromeNumber.isPalindrome(x);
//        }
//        double end = System.nanoTime()/1000000000;
//        double time = end - start;
//        System.out.println("Время: " + time);
//        System.out.println(palindromeNumber.isPalindrome(10000));
//    }
//}


      /* public class PalindromNumber {
    public boolean isPalindrome(int x) {
      //153
        //351
        // return 153 == 351 false
        //121
        //121
        // return 121 == 121 true
        if (x<0) {
            return false;
        }
        if(x % 10 == 0 && x != 0) { //x остаток от деления равен 0 и при этом х != 0, потому что х это тоже палиндром
            return false;
        }
        int invertedNumber = 0; //создаем инвертированное значение
        int copeOfX = x; // с этим числом сравниваем invertedNumber

        while (copeOfX != 0) {
            invertedNumber = invertedNumber *10 + copeOfX %10; // чтоб дать место для 0 + copeOfX остаток от деления
            copeOfX = copeOfX / 10; // убираем 10
        }
        return invertedNumber == x; // Сравниваем занчение
    }
}*/

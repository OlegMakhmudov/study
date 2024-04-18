package FileExample;

//Есть входные данные формат строки: Вид лога, [Имя потока], Текст лога
//Посчитать сколько каждого вида логов
//Найти поток, который записал больше всего данных
//Для него вывести в порядке, задаваемом пользователем статистикау по видам логов


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
   static String text = "\"ERROR [thread [qbxb [bbb]] - 1] yaee ybz\",\n" +
           "\"ERROR [thread [xcde [aqx]] - 0] wyce\",\n" +
           "\"ERROR [thread [wcxf [czed [ayya [fye]]]] - 0] eaba yzd\",\n" +
           "\"DEBUG [thread [zqfz [wbye [zfq]]] - 1] [cz] bxa\",\n" +
           "\"WARNING [thread [xcde [aqx]] - 0] dbdf wey\",\n" +
           "\"ERROR [thread [qbxb [bbb]] - 1] zqz\",\n" +
           "\"INFO [thread [xcde [aqx]] - 0] ccxd\",\n" +
           "\"ERROR [thread [qbxb [bbb]] - 1] fqwx [yc] exb\",\n" +
           "\"ERROR [thread [xcde [aqx]] - 0] [xf]\",\n" +
           "\"INFO [thread [zqfz [wbye [zfq]]] - 1] qdcq\",\n" +
           "\"ERROR [thread [wcxf [czed [ayya [fye]]]] - 0] cfqb [ed]\",\n" +
           "\"WARNING [thread [wcxf [czed [ayya [fye]]]] - 0]\", \n" +
           "\"ERROR [thread [wcxf [czed [ayya [fye]]]] - 0] ebew [q]\",\n" +
           "\"INFO [thread [xcde [aqx]] - 0] dwwf wbd\", \n" +
           "\"DEBUG [thread [wcxf [czed [ayya [fye]]]] - 0] ybqx\", \n" +
           "\"INFO [thread [wcxf [czed [ayya [fye]]]] - 0] [yb]\", \n" +
           "\"DEBUG [thread [xcde [aqx]] - 0] zqfx wzq\", \n" +
           "\"INFO [thread [qbxb [bbb]] - 1] bzyz eba\", \n" +
           "\"WARNING [thread [zqfz [wbye [zfq]]] - 1] wqqa [e] zqw\", \n" +
           "\"TRACE [thread [xcde [aqx]] - 0] cbdx\",\n" +
           "\"TRACE [thread [wcxf [czed [ayya [fye]]]] - 0] yafd [a]\",\n" +
           "\"TRACE [thread [qbxb [bbb]] - 1] faez\",\n" +
           "\"WARNING [thread [xcde [aqx]] - 0] [qw] eed\",\n" +
           "\"WARNING [thread [xcde [aqx]] - 0] yzz\",\n" +
           "\"DEBUG [thread [qbxb [bbb]] - 1] bxef";

            String[] parts = text.split( " ");
            String part1 = parts[ 0 ];

   //   List<String> files = List.of("\"ERROR [thread [qbxb [bbb]] - 1] yaee ybz\",\n" +
//            "\"ERROR [thread [xcde [aqx]] - 0] wyce\",\n" +
//            "\"ERROR [thread [wcxf [czed [ayya [fye]]]] - 0] eaba yzd\",\n" +
//            "\"DEBUG [thread [zqfz [wbye [zfq]]] - 1] [cz] bxa\",\n" +
//            "\"WARNING [thread [xcde [aqx]] - 0] dbdf wey\",\n" +
//            "\"ERROR [thread [qbxb [bbb]] - 1] zqz\",\n" +
//            "\"INFO [thread [xcde [aqx]] - 0] ccxd\",\n" +
//            "\"ERROR [thread [qbxb [bbb]] - 1] fqwx [yc] exb\",\n" +
//            "\"ERROR [thread [xcde [aqx]] - 0] [xf]\",\n" +
//            "\"INFO [thread [zqfz [wbye [zfq]]] - 1] qdcq\",\n" +
//            "\"ERROR [thread [wcxf [czed [ayya [fye]]]] - 0] cfqb [ed]\",\n" +
//            "\"WARNING [thread [wcxf [czed [ayya [fye]]]] - 0]\", \n" +
//            "\"ERROR [thread [wcxf [czed [ayya [fye]]]] - 0] ebew [q]\",\n" +
//           "\"INFO [thread [xcde [aqx]] - 0] dwwf wbd\", \n" +
//           "\"DEBUG [thread [wcxf [czed [ayya [fye]]]] - 0] ybqx\", \n" +
//           "\"INFO [thread [wcxf [czed [ayya [fye]]]] - 0] [yb]\", \n" +
//           "\"DEBUG [thread [xcde [aqx]] - 0] zqfx wzq\", \n" +
//           "\"INFO [thread [qbxb [bbb]] - 1] bzyz eba\", \n" +
//           "\"WARNING [thread [zqfz [wbye [zfq]]] - 1] wqqa [e] zqw\", \n" +
//           "\"TRACE [thread [xcde [aqx]] - 0] cbdx\",\n" +
//           "\"TRACE [thread [wcxf [czed [ayya [fye]]]] - 0] yafd [a]\",\n" +
//           "\"TRACE [thread [qbxb [bbb]] - 1] faez\",\n" +
//           "\"WARNING [thread [xcde [aqx]] - 0] [qw] eed\",\n" +
//           "\"WARNING [thread [xcde [aqx]] - 0] yzz\",\n" +
//           "\"DEBUG [thread [qbxb [bbb]] - 1] bxef");

   String regex1 = "ERROR";
   static Pattern pattern = Pattern.compile("ERROR");
   static Matcher matcher = pattern.matcher(text);
   String regex2 = "INFO";
   String regex3 = "DEBUG";
   String regex4 = "TRACE";
   String regex5 = "WARNING";

    public static void recursionFunc() {
        System.out.println("Привет!");
        recursionFunc();
    }


   public static void main(String[] args) {
//      Test test = new Test();
//      System.out.println(test.part1);
//      //System.out.println(text.substring(matcher.start(), matcher.end()));
//       System.out.println(recursionFunc());
   }

}

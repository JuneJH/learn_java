package learn_tools_class;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_string {

    public static void main(String[] args) {

        // StringBuffer: 同步的，安全高，效率低
        // StringBuilder

        // substring() replace(); 使用不相同

        // String



        String str1 = "iii";
        String str2 = "string";
        String str3 = new String("string");

        str1.compareTo(str2);


        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3);


        boolean isFlag = str1.matches("[i]{2,3}");

        System.out.println(isFlag);

        Pattern pattern = Pattern.compile("[gp][eo][ts][t]?");

        String methods = "getsdlfjpostsklfj;lgetasdfjl;postsdl;kfjl;get";

        Matcher matcher = pattern.matcher(methods);

        while (matcher.find()){
            System.out.println(matcher.group());
        }






    }
}

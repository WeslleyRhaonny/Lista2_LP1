package L2_03.classesauxiliares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verificadores {
    public static boolean isNumeric(String input){
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}

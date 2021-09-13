package by.epamtc.zhenekns.dev;

import sun.jvm.hotspot.types.WrongTypeException;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str){

        for(String element: str){
            boolean isPositiveNumber = isPositiveNumber(element);
            if(!isPositiveNumber)
                return false;
        }
        return true;
    }

    private static boolean isPositiveNumber(String str) {
        double number = 0;
        try {
            number = Double.parseDouble(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return number >= 0;
    }
}

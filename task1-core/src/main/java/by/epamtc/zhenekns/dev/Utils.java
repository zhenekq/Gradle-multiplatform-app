package by.epamtc.zhenekns.dev;


import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        boolean isAllPositiveNumbers;
        isAllPositiveNumbers = Arrays.stream(str)
                .allMatch(StringUtils::isNumeric);
        return isAllPositiveNumbers;
    }

    public static boolean isPositiveNumber(String str) {
        boolean isPositiveNumber;
        isPositiveNumber = StringUtils.isNumeric(str);
        return isPositiveNumber;
    }
}

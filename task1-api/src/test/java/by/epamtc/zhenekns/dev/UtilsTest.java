package by.epamtc.zhenekns.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {

    @Test
    public void correctResultOfPositiveNumbers(){
        boolean predictableResult = true;
        boolean result = Utils.isAllPositiveNumbers("12", "333", "444");
        assertEquals(result, predictableResult);
    }

    @Test
    public void incorrectResultOfPositiveNumbers(){
        boolean predictableResult = false;
        boolean result = Utils.isAllPositiveNumbers("-12", "333", "-444");
        assertEquals(result, predictableResult);
    }
}

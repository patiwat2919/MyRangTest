import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeTest {
    @Test
    @DisplayName("data [1,5] check start with [ (include) result is true")
    public void StartWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStratWithInclude();
        assertTrue(result);
    }
    @Test
    @DisplayName("data (1,5] check start with ] (exclude) result is true")
    public void StartWithExclude(){
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.isStratWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("data [1,5] check start with [ (include) result is true")
    public void EndWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isEndWithInclude();
        assertTrue(result);
    }
    @Test
    @DisplayName("data (1,5] check start with ] (exclude) result is true")
    public void EndWithExclude(){
        MyRange myRange = new MyRange("[1,5)");
        boolean result = myRange.isEndWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("data (1,5] check start with 1 (exclude) result is true")
    public void StartNumberWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1,result);
    }
    @Test
    @DisplayName("data (1,5] check start with 1 (exclude) result is true")
    public void StartNumberWithExclude(){
        MyRange myRange = new MyRange("[2,5]");
        int result = myRange.getStart();
        assertNotEquals(1,result);
    }
}

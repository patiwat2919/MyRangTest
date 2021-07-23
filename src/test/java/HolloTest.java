import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolloTest {
    // f(name) = "Hello Patiwat"
    @Test
    @DisplayName("Test 001 ...")
    public void case01(){
        Hollo hello = new Hollo();
        String name = "Patiwat";
        String result = hello.sawadee(name);
        assertEquals("Hello Patiwat",result);
    }
}
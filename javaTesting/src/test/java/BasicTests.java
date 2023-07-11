import org.example.Basics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicTests {
    //Tests going to go in here
    @Test
    public void compare(){
        Basics basicTests = new Basics();
        int value = basicTests.compare(2,1);
        Assertions.assertEquals(1,value);
    }

    @Test
    public void compare2(){
        Basics basicTests = new Basics();
        int value = basicTests.compare(2,3);
        Assertions.assertEquals(-1,value);
    }
}

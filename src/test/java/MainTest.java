import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void FirstTest(){
        Assertions.assertEquals("Going to school","Went to college");
    }
    @Test
    public void FailTest(){
        new AssertionError();
    }

}
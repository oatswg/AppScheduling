import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    @Test
    public void AddBtnTest(){
        fail("Invalid input.");

    }

    @Test
    public void DeleteBtnTest(){
        fail("Delete error.");
    }

    @Test
    public void EditTest(){
        fail("Not assignment list.");
    }

    @Test
    public void AssmentTest(){
        Assertions.assertEquals("Char","Number");

    }
    @Test
    public void DateTest(){
        Assertions.assertEquals("07/09/60","7/9/60");

    }
    @Test
    public void TimeTest(){
        Assertions.assertEquals("12.00","25.00");

    }
    @Test
    public void AssmentFail(){
        fail("Invalid input.");
    }
    @Test
    public void DateFail(){
        fail("Invalid input.");
    }
    @Test
    public void TimeFail(){
        fail("Invalid input.");
    }


}
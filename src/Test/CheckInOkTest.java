package Test;
import data.interfence.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CheckInOkTest {
    @Test
    public void testcheckIn() {
        LoginValidate.queryBookid("TE123456");
        assertEquals(true,CheckInOK.checkIn("Test","987654"));
    }
}

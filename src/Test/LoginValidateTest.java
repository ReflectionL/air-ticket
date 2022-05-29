package Test;
import data.interfence.LoginValidate;
import data.interfence.ReadTXT;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LoginValidateTest {
    @Test
    public void testQueryBookid() {
        assertEquals(true, LoginValidate.queryBookid("TE123456"));
    }
    @Test
    public void testQueryid() {
        assertEquals(true,LoginValidate.queryID("987654","Test"));
    }
}

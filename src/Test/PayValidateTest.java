package Test;
import data.interfence.LoginValidate;
import data.interfence.PayValidate;
import data.interfence.ReadTXT;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayValidateTest {
    @Test
    public void testQueryBank() {
        PayValidate.querybank("123","456");
        assertEquals(2, ReadTXT.listbank.size());
    }
}

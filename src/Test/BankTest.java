package Test;
import data.interfence.Bank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BankTest {
    @Test
    public void testBank() {
        Bank bank=new Bank();
        bank.setBankid("123456");
        bank.setPassword("111");
        assertEquals("123456",bank.getBankid());
        assertEquals("111",bank.getPassword());

    }
}

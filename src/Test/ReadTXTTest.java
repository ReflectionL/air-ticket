package Test;
import data.interfence.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReadTXTTest {
    @Test
    public void testReadFile() {
        String price="{\"seatprice\":\"100\",\"mealA\":\"20\",\"mealB\":\"30\",\"insuranceA\":\"40\"}";
        assertEquals(price, ReadTXT.readFile("src/data/price.txt"));

    }


}

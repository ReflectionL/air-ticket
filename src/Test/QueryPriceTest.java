package Test;
import data.interfence.QueryPrice;
import data.interfence.ReadTXT;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueryPriceTest {
    @Test
    public void testGetallprice() {
        assertEquals(true, ReadTXT.price.getInsuranceA()==0);
        QueryPrice.getAllprice();
        assertEquals(false,ReadTXT.price.getInsuranceA()==0);

    }
}

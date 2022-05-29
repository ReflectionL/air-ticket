package Test;
import data.interfence.Price;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PriceTest {
    @Test
    public void testPrice() {
        Price price=new Price();
        price.setMealA(10);
        price.setMealB(20);
        price.setSeatprice(100);
        price.setInsuranceA(200);
        assertEquals(10,price.getMealA());
        assertEquals(20,price.getMealB());
        assertEquals(100,price.getSeatprice());
        assertEquals(200,price.getInsuranceA());

    }
}

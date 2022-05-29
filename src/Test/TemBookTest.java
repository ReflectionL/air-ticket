package Test;
import data.interfence.TemBook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TemBookTest {
    @Test
    public void testTemBook(){
        TemBook tem=new TemBook();
        tem.setFood("Meal");
        tem.setSeat("36A");
        tem.setSeatrank(1);
        tem.setInsurance(1);
        tem.setFoodPrice(10);
        tem.setSeatPrice(100);
        tem.setInsurancePrice(20);
        assertEquals("Meal",tem.getFood());
        assertEquals("36A",tem.getSeat());
        assertEquals(1,tem.getInsurance());
        assertEquals(10,tem.getFoodPrice());
        assertEquals(100,tem.getSeatPrice());
        assertEquals(20,tem.getInsurancePrice());
        assertEquals(1,tem.getSeatrank());
        assertEquals(130,tem.sumPrice());
    }
}

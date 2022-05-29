package Test;
import data.interfence.AirTicket;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AirTicketTest {
    @Test
    public void testAirTicket() {
        AirTicket air=new AirTicket();
        air.setBookID("AS1234560");
        air.setName("Lucy");
        air.setID("412713123");
        air.setPhone("184103124");
        air.setBegintime("2022-05-25 18:00");
        air.setEndtime("2022-05-25 22:00");
        air.setBeginplace("Beijing");
        air.setEndplace("Shanghai");
        air.setFlightno("CA1503");
        air.setSeat("30B");
        air.setSeatrank(0);
        air.setBoardinggate("04");
        air.setFood("Standard Plane Meal");
        air.setCheckin(1);
        air.setCarryluggage(1);
        air.setCheckluggage(0);
        air.setCarryid("123456");
        assertEquals("AS1234560",air.getBookID());
        assertEquals("Lucy",air.getName());
        assertEquals("412713123",air.getID());
        assertEquals("184103124",air.getPhone());
        assertEquals("2022-05-25 18:00",air.getBegintime());
        assertEquals("2022-05-25 22:00",air.getEndtime());
        assertEquals("Beijing",air.getBeginplace());
        assertEquals("Shanghai",air.getEndplace());
        assertEquals("CA1503",air.getFlightno());
        assertEquals("30B",air.getSeat());
        assertEquals(0,air.getSeatrank());
        assertEquals("04",air.getBoardinggate());
        assertEquals("Standard Plane Meal",air.getFood());
        assertEquals(1,air.getCheckin());
        assertEquals(1,air.getCarryluggage());
        assertEquals(0,air.getCheckluggage());
        assertEquals("123456",air.getCarryid());



    }

}

package Test;
import data.interfence.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class QuerySeatTest{
    @Test
    public void testQuerySeat() {
        AirTicket air=new AirTicket();
        air.setFlightno("TE1234");
       LoginValidate.queryBookid("TE123456");
        assertEquals(true, QuerySeat.querySeat(air).size()!=0);

    }
}

package data.interfence;

import java.util.ArrayList;
import java.util.List;
/**
 * This class uses methods to search for selected seats by flight number.
 * @author Pengtao Li
 * @version 1.0
 **/
public class QuerySeat {
    /** Search for selected seats by flight number
     * @param air AirTicket object
     * @return listseat  All selected seats
     */
    public static List<String> querySeat(AirTicket air){
        List<String> listseat=new ArrayList<String>();
        for(int i=0;i<ReadTXT.listAir.size();i++)
        {
            if(ReadTXT.listAir.get(i).getFlightno().equals(air.getFlightno()))
            {
                listseat.add(ReadTXT.listAir.get(i).getSeat());
            }
        }
        return listseat;
    }

}

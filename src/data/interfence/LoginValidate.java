package data.interfence;
import com.alibaba.fastjson.JSON;
import java.text.SimpleDateFormat;
import java.util.Date;
/**This class uses methods to query airticket information  by booking id or ID and name and to remove outdated information.
 * @author Pengtao Li,Xiaolou Li,Zhengyu Shao
 * @version 1.0
 **/
public class LoginValidate {

    /** Converts a string to an array of AirTicket objects removes expired data.
     *
     */
    private static void readDatabase() {
        String json= ReadTXT.readFile("src/data/airticket.txt");
        ReadTXT.listAir = JSON.parseArray(json, AirTicket.class);
        for(int i = 0; i< ReadTXT.listAir.size(); i++)
        {
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Date date=format.parse(ReadTXT.listAir.get(i).getBegintime());
                long time1=86400000l;
                if(date.getTime()+time1 < System.currentTimeMillis())
                {

                    ReadTXT.listAir.remove(i--);
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        if (ReadTXT.tickets.size()!=0)
        {
            ReadTXT.tickets.clear();
            ReadTXT.ticket = null;
        }
    }
    /** Query information by booking ID and verify that it exists
     * @param bookid The booking ID of Airticket
     * @return boolean
     */
    public static boolean queryBookid(String bookid){
        readDatabase();
        boolean find = false;
        for(int i = 0; i< ReadTXT.listAir.size(); i++)
        {
            if(bookid.equals(ReadTXT.listAir.get(i).getBookID())){
                ReadTXT.ticket = ReadTXT.listAir.get(i);
                ReadTXT.tickets.add(ReadTXT.ticket);
                find = true;
            }
        }
        return find;
    }

    /** Query information by name and ID and verify that it exists
     * @param ID  The ID of passenger
     * @param name  The name of passenger
     * @return boolean
     */
    public static boolean queryID(String ID, String name){
        readDatabase();
        boolean find = false;
        /**
         * Store the flight information found to tickets.
         */
        for(int i = 0; i< ReadTXT.listAir.size(); i++)
        {
            if(ID.equals(ReadTXT.listAir.get(i).getID()) && name.equals(ReadTXT.listAir.get(i).getName())){
                ReadTXT.tickets.add(ReadTXT.listAir.get(i));
                find = true;
            }
        }
        return find;
    }
}

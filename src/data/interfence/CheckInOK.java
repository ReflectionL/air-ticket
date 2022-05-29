package data.interfence;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.*;
/** This class uses methods to validate check-in information and to write updated information to a file.
 * @author Pengtao Li,Xiaolou Li,Zhengyu Shao
 * @version 1.0
 **/
public class CheckInOK {
    /** Write updated flight information to airticket.txt
     * @param air  An AirTicket object,contains updated flight information
     */
    private static void writeFile(AirTicket air){
        try {
            try (OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("src/data/airticket.txt"))) {
                BufferedWriter bw=new BufferedWriter(out);
                for(int i = 0; i< ReadTXT.listAir.size(); i++)
                {    if(air.getBookID().equals(ReadTXT.listAir.get(i).getBookID())){
                    ReadTXT. listAir.set(i,air);
                    break;
                }
                }
                String jString= JSON.toJSONString(ReadTXT.listAir, SerializerFeature.PrettyFormat,SerializerFeature.DisableCircularReferenceDetect);
                bw.write(jString);
                bw.flush();
                out.close();
                bw.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /** Verify check-in information
     * @param name The name of the passenger
     * @param ID The ID of the passenger
     * @return boolean ture/false
     */
    public static boolean checkIn(String name, String ID){
        if (ReadTXT.ticket.getName().equals(name) && ReadTXT.ticket.getID().equals(ID))
        {   ReadTXT.ticket.setCheckin(1);
            CheckInOK.writeFile(ReadTXT.ticket);
            return true;
        }
        else {
            return false;
        }
    }
}

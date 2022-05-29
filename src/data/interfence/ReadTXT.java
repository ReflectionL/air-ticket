package data.interfence;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This class uses methods to read all data in txt file by address of file.
 * @author Pengtao Li
 * @version 1.0
 **/
public class ReadTXT {
    /**
     * a static array of AirTicket objects
     */
    public static List<AirTicket> listAir = new ArrayList<AirTicket>();
    /**
     * a static AirTicket object.
     */
    public static AirTicket ticket = new AirTicket();
    /**
     * a static TemBook object.
     */
    public static TemBook temBook = new TemBook();
    /**
     * a static array of AirTicket objects
     */
    public static List<AirTicket> tickets = new ArrayList<AirTicket>();
    /**
     * a static Price object.
     */
    public static Price price = new Price();
    /**
     * a static array of Bank objects
     */
    public static List<Bank> listbank = new ArrayList<Bank>();


    /** Read all data in txt file
     * @param address the address of the file
     * @return String Read all data in airticket.txt to string
     */
    public static String readFile(String address){
         try {
                 try (FileInputStream fis = new FileInputStream(address)) {
                     StringBuffer sb=new StringBuffer();
                     int len=0;
                     while(true){
                     byte[] b=new byte[1024];
                     len=fis.read(b);
                     if(len<0){
                        break;
                     }
                     sb.append(new String(b,0,len));
                     }
                     fis.close();
                     return sb.toString();
                 }
         }
         catch (FileNotFoundException e) {
             e.printStackTrace();
         }
         catch (IOException e){
             e.printStackTrace();
         }
         return null;
    }
}

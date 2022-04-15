package data;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import com.alibaba.fastjson.JSON;

public class ReadTXT {
    public static List<AirTicket> listAir = new ArrayList<AirTicket>();
    public static AirTicket ticket = new AirTicket();
    public static TemBook temBook;
    public static List<AirTicket> tickets = new ArrayList<AirTicket>();
    public static void queryBookid(String bookid){
        String json=readFile();
        listAir =JSON.parseArray(json,AirTicket.class);
        if (tickets.size()!=0)
        {
            tickets.clear();
        }
        for(int i = 0; i< listAir.size(); i++)
        {
            if(bookid.equals(listAir.get(i).getBookID())){
                ticket = listAir.get(i);
                break;
            }
        }
        // System.out.println(listair.size());
    }
    public static void queryID(String ID){
        String json=readFile();
        listAir =JSON.parseArray(json,AirTicket.class);
        if (tickets.size()!=0)
        {
            tickets.clear();
        }
        for(int i = 0; i< listAir.size(); i++)
        {
            if(ID.equals(listAir.get(i).getID())){
                tickets.add(listAir.get(i));
            }
        }
        // System.out.println(querylistair.size());
        // System.out.println(listair.size());
        // System.out.println(querylistair.get(0).getBookID());
        // System.out.println(querylistair.get(1).getBookID());

    }
    public static String readFile(){
         try {
                 try (FileInputStream fis = new FileInputStream("src/data/test.txt")) {
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
        
            } catch (FileNotFoundException e) {
             e.printStackTrace();
             }catch (IOException e){
              e.printStackTrace();
             }
             return null;
    }
    public static void writeFile(AirTicket air){
        try {
            try (OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("src/data/test.txt"))) {
               BufferedWriter bw=new BufferedWriter(out);
               for(int i = 0; i< listAir.size(); i++)
               {    if(air.getBookID().equals(listAir.get(i).getBookID())){
                        listAir.set(i,air);
                        break;
                    }
               }
               String jString=JSON.toJSONString(listAir);
                bw.write(jString);
                bw.flush();
                bw.close();
                out.close();
           }
   
       } catch (FileNotFoundException e) {
        e.printStackTrace();
        }catch (IOException e){
         e.printStackTrace();
        }

    }
}

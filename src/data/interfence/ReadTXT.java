package data.interfence;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import data.interfence.AirTicket;
import data.interfence.Bank;
import data.interfence.Price;
import data.interfence.TemBook;
import logic.AirportSystem;

public class ReadTXT {
    public static List<AirTicket> listAir = new ArrayList<AirTicket>();
    public static AirTicket ticket = new AirTicket();
    public static TemBook temBook = new TemBook();
    public static List<AirTicket> tickets = new ArrayList<AirTicket>();
    public static List<String> listseat=new ArrayList<String>();

    public static Price price = new Price();
    public static List<Bank> listbank = new ArrayList<Bank>();
    public static void queryBookid(String bookid){
        String json=readFile();
        listAir =JSON.parseArray(json,AirTicket.class);
        if (tickets.size()!=0)
        {
            tickets.clear();
            ticket = null;
            AirportSystem.totalTicket = 0;
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
    public static List<String> querySeat(AirTicket air){
        List<String> listseat=new ArrayList<String>();
        for(int i=0;i<listAir.size();i++)
        {
            if(listAir.get(i).getFlightno().equals(air.getFlightno()))
            {
                listseat.add(listAir.get(i).getSeat());
            }
        }
        return listseat;
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

                String jString=JSON.toJSONString(listAir, SerializerFeature.PrettyFormat,SerializerFeature.DisableCircularReferenceDetect);
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

    public static void getAllprice(){
        String json=readpriceFile();
        price=JSON.parseObject(json,Price.class);
        System.out.println(price.getInsuranceA());

    }

    public static String readpriceFile(){
        try {
            try (FileInputStream fis = new FileInputStream("/data/price.txt")) {
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
    public static void querybank(){
        String json=readBankFile();
        listbank=JSON.parseArray(json,Bank.class);
    }
    public static String readBankFile(){
        try {
            try (FileInputStream fis = new FileInputStream("/data/bank.txt")) {
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
}

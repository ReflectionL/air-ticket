package data;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
    ReadTXT.queryBookid("AS1234560");
    ReadTXT.queryID("42152123202415211");
    AirTicket air=new AirTicket("AS1234560","42152123202415211","PengLi","MAHANG 1212",new Date(),new Date(),"Beijin","Shanghai","01-C","04","C",1,1,0);
     //ReadTXT.listair.add(air);
     ReadTXT.writeFile(air);
    }
    
}

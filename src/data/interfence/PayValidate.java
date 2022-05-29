package data.interfence;

import com.alibaba.fastjson.JSON;
/**This class uses methods to verify that the bank card number and password are correct and to update ReadTXT.ticket information.
 * @author Pengtao Li,Xiaolou Li,Zhengyu Shao
 * @version 1.0
 **/
public class PayValidate {

    /** Verify that the bank card number and password are correct
     * @param id the bank card number
     * @param passward the bank card password
     * @return boolean
     */
    public static boolean querybank(String id, String passward){
        String json=ReadTXT.readFile("src/data/bank.txt");
        ReadTXT.listbank= JSON.parseArray(json,Bank.class);
        for (int i=0;i<ReadTXT.listbank.size();i++){
            if (ReadTXT.listbank.get(i).getBankid().equals(id) && (ReadTXT.listbank.get(i).getPassword().equals(passward))){
                PayValidate.successPay();
                return true;
            }
        }
        return false;
    }

    /**
     * update ReadTXT.ticket information
     */
    public static void successPay(){
        ReadTXT.ticket.setSeat(ReadTXT.temBook.getSeat());
        ReadTXT.ticket.setFood(ReadTXT.temBook.getFood());
        ReadTXT.ticket.setInsurance(ReadTXT.temBook.getInsurance());
        if(ReadTXT.ticket.getSeatrank() == 1 && ReadTXT.temBook.getSeatrank() == 0)
            ReadTXT.ticket.setSeatrank(ReadTXT.temBook.getSeatrank());
    }
}

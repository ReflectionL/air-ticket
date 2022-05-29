package data.interfence;
import com.alibaba.fastjson.JSON;
/**
 * This class uses methods to get prices for seats, meals, and insurance.
 * @author Pengtao Li
 * @version 1.0
 */
public class QueryPrice {
    /**
     * Get prices for seats, meals, and insurance
     */
    public static void getAllprice(){
        String json=ReadTXT.readFile("src/data/price.txt");
        ReadTXT.price= JSON.parseObject(json,Price.class);
    }

}

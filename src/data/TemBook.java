package data;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/1 18:18
 * @description：this class store the book information temperarily
 * @modified By：
 * @version: 1.0$
 */
public class TemBook {
    private String seat;
    private float seatPrice = 0;
    private float foodPrice = 0;
    private float insurancePrice = 0;

    public float getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(float seatPrice) {
        this.seatPrice = seatPrice;
    }

    public float getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(float foodPrice) {
        this.foodPrice = foodPrice;
    }

    public float getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(float insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public float sumPrice(){
        return seatPrice+foodPrice+insurancePrice;
    }
}

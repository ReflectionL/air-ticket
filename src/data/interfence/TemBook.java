package data.interfence;

/**
 * This class store the book information temperarily
 * @author ：Xiaolou Li,Zhengyu Shao
 * @version 1.0
 */
public class TemBook {
    /**
     * Temporary seat
     */
    private String seat;
    /**
     * Temporary food
     */
    private String food="";
    /**
     * Temporary insurance
     */
    private int insurance;
    /**
     * Temporary seat rank
     */
    private int seatrank;

    /** GET temporary seat rank
     * @return seatrank
     */
    public int getSeatrank() {
        return seatrank;
    }

    /** SET temporary seat rank
     * @param seatrank
     */
    public void setSeatrank(int seatrank) {
        this.seatrank = seatrank;
    }

    private float seatPrice = 0;
    private float foodPrice = 0;
    private float insurancePrice = 0;
    /** GET temporary seat price
     * @return seatPrice
     */
    public float getSeatPrice() {
        return seatPrice;
    }
    /** SET temporary seat Price
     * @param seatPrice
     */
    public void setSeatPrice(float seatPrice) {
        this.seatPrice = seatPrice;
    }
    /** GET temporary food price
     * @return food price
     */
    public float getFoodPrice() {
        return foodPrice;
    }
    /** SET temporary food Price
     * @param foodPrice
     */
    public void setFoodPrice(float foodPrice) {
        this.foodPrice = foodPrice;
    }
    /** GET temporary insurance price
     * @return insurancePrice
     */
    public float getInsurancePrice() {
        return insurancePrice;
    }
    /** SET temporary insuracne Price
     * @param insurancePrice
     */
    public void setInsurancePrice(float insurancePrice) {
        this.insurancePrice = insurancePrice;
    }
    /** GET temporary seat
     * @return seat
     */
    public String getSeat() {
        return seat;
    }
    /** SET temporary seat
     * @param seat
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * @return float The sum price of seat, food, insurance
     */
    public float sumPrice(){
        return seatPrice+foodPrice+insurancePrice;
    }
    /** GET temporary food
     * @return food
     */
    public String getFood() {
        return food;
    }
    /** SET temporary food
     * @param food
     */
    public void setFood(String food) {
        this.food = food;
    }
    /** GET temporary insurance
     * @return insurance
     */
    public int getInsurance() {
        return insurance;
    }
    /** SET temporary insurance
     * @param insurance
     */
    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    /** Transform the insurance representation
     * @return String Yes/No
     */
    public String getRealInsurance() {
        if (insurance == 0)
            return "No";

        else if (insurance == 1)
            return "Yes";

        else
            return "No";
    }
}

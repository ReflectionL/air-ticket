package data.interfence;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/1 18:18
 * @description：this class store the book information temperarily
 * @modified By：
 * @version: 1.0$
 */
public class TemBook {
    private String seat;
    private String food;
    private int insurance;
    private int seatrank;

    public int getSeatrank() {
        return seatrank;
    }

    public void setSeatrank(int seatrank) {
        this.seatrank = seatrank;
    }

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

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    public String getRealFood() {
        if (food == null)
            return "xixi";

        else if (food.equals("A"))
            return "No Meal.";

        else if (food.equals("B"))
            return "Standard Plane Meal(Pasta + Hamburger).";

        else
            return "Luxurious Plane Meal(Pasta + Hamburger + Coke).";
    }
    public String getRealInsurance() {
        if (insurance == 0)
            return "No Insurance.";

        else if (insurance == 1)
            return "Standard Insurance";

        else
            return "Supreme Insurance.";
    }
}

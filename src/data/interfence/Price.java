package data.interfence;
/** Price information for all services in this class
 * @author Pengtao Li
 * @version 1.0
 **/
public class Price {
    /**
     * The price of seat
     */
    private int seatprice=0;
    /**
     * The price of meal A
     */
	private int mealA=0;
    /**
     * The price of meal B
     */
	private int mealB=0;
    /**
     * The price of insurance
     */
	private int insuranceA=0;

    /** GET the price of seat
     * @return seatprice
     */
    public int getSeatprice() {
        return seatprice;
    }

    /** GET the price of meal A
     * @return mealA
     */
    public int getMealA() {
        return mealA;
    }

    /** GET the price of meal B
     * @return mealB
     */
    public int getMealB() {
        return mealB;
    }

    /** GET the price of insurance
     * @return insuranceA
     */
    public int getInsuranceA() {
        return insuranceA;
    }

    /** SET seat price
     * @param seatprice
     */
    public void setSeatprice(int seatprice) {
        this.seatprice = seatprice;
    }

    /** SET meal A price
     * @param mealA
     */
    public void setMealA(int mealA) {
        this.mealA = mealA;
    }

    /** SET meal B price
     * @param mealB
     */
    public void setMealB(int mealB) {
        this.mealB = mealB;
    }

    /** SET insurance price
     * @param insuranceA
     */
    public void setInsuranceA(int insuranceA) {
        this.insuranceA = insuranceA;
    }
}

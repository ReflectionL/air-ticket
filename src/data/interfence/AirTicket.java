package data.interfence;

import java.util.Date;
public class AirTicket {

	private String BookID;
	private String ID;
	private String name;
	private String flightno;
	private Date begintime;
	private Date endtime;
	private String beginplace;
	private String endplace;
	private String seat;
	private String boardinggate;
	private String food;
	private int seatrank;
	private int luggage;
	private int insurance;

	public AirTicket() {
	}

	public AirTicket(String bookID, String iD, String name, String flightno, Date begintime, Date endtime,
			String beginplace, String endplace, String seat, String boardinggate, String food, int seatrank,
			int luggage, int insurance) {
		BookID = bookID;
		ID = iD;
		this.name = name;
		this.flightno = flightno;
		this.begintime = begintime;
		this.endtime = endtime;
		this.beginplace = beginplace;
		this.endplace = endplace;
		this.seat = seat;
		this.boardinggate = boardinggate;
		this.food = food;
		this.seatrank = seatrank;
		this.luggage = luggage;
		this.insurance = insurance;
	}







	public String getBookID() {
		return BookID;
	}



	public void setBookID(String bookID) {
		BookID = bookID;
	}



	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getBegintime() {
		return begintime;
	}



	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}



	public Date getEndtime() {
		return endtime;
	}



	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}



	public String getBeginplace() {
		return beginplace;
	}



	public void setBeginplace(String beginplace) {
		this.beginplace = beginplace;
	}



	public String getEndplace() {
		return endplace;
	}



	public void setEndplace(String endplace) {
		this.endplace = endplace;
	}



	public String getSeat() {
		return seat;
	}



	public void setSeat(String seat) {
		this.seat = seat;
	}



	public String getBoardinggate() {
		return boardinggate;
	}



	public void setBoardinggate(String boardinggate) {
		this.boardinggate = boardinggate;
	}



	public String getFood() {
		return food;
	}



	public void setFood(String food) {
		this.food = food;
	}



	public int getSeatrank() {
		return seatrank;
	}



	public void setSeatrank(int seatrank) {
		this.seatrank = seatrank;
	}



	public int getLuggage() {
		return luggage;
	}



	public void setLuggage(int luggage) {
		this.luggage = luggage;
	}



	public int getInsurance() {
		return insurance;
	}



	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}


	public String getFlightno() {
		return flightno;
	}


	public void setFlightno(String flightno) {
		this.flightno = flightno;
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

	public String getRealSeatrank() {
		if (seatrank == 0)
			return "First Class";

		else
			return "Second Class";
	}

	public String getRealLuggage() {
		if (luggage == 0)
			return "No";

		else
			return "Yes";
	}
}

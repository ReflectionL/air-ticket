package data.interfence;

import java.util.Date;
public class AirTicket {

	private String BookID;
	private String ID;
	private String name;
	private String phone;
	private String flightno;
	private String begintime;
	private String endtime;
	private String beginplace;
	private String endplace;
	private String seat;
	private String boardinggate;
	private String food;
	private int seatrank;
	private int carryluggage;
	private int checkluggage;
	private int insurance;
	private int checkin;
	private String carryid;

	public AirTicket() {
	}


	public AirTicket(String bookID, String ID, String name, String phone, String flightno, String begintime, String endtime, String beginplace, String endplace, String seat, String boardinggate, String food, int seatrank, int carryluggage, int checkluggage, int insurance, int checkin, String carryid) {
		BookID = bookID;
		this.ID = ID;
		this.name = name;
		this.phone = phone;
		this.flightno = flightno;
		this.begintime = begintime;
		this.endtime = endtime;
		this.beginplace = beginplace;
		this.endplace = endplace;
		this.seat = seat;
		this.boardinggate = boardinggate;
		this.food = food;
		this.seatrank = seatrank;
		this.carryluggage = carryluggage;
		this.checkluggage = checkluggage;
		this.insurance = insurance;
		this.checkin = checkin;
		this.carryid = carryid;
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



	public String getBegintime() {
		return begintime;
	}



	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}



	public String getEndtime() {
		return endtime;
	}



	public void setEndtime(String endtime) {
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




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	public int getCarryluggage() {
		return carryluggage;
	}




	public void setCarryluggage(int carryluggage) {
		this.carryluggage = carryluggage;
	}




	public int getCheckluggage() {
		return checkluggage;
	}




	public void setCheckluggage(int checkluggage) {
		this.checkluggage = checkluggage;
	}




	public int getCheckin() {
		return checkin;
	}




	public void setCheckin(int checkin) {
		this.checkin = checkin;
	}

	public String getCarryid() {
		return carryid;
	}

	public void setCarryid(String carryid) {
		this.carryid = carryid;
	}

	public String getRealFood() {
		if (food == null)
			return "";

		else if (food.equals("A"))
			return "";

		else if (food.equals("B"))
			return "Standard Plane Meal";

		else
			return "Luxurious Plane Meal";
	}

	public String getRealInsurance() {
		if (insurance == 0)
			return "No";
		else
			return "Yes";
	}

	public String getRealSeatrank() {
		if (seatrank == 0)
			return "First Class";

		else
			return "Second Class";
	}

	public String getRealLuggage() {
		if (carryluggage== 0)
			return "No";

		else
			return "Yes";
	}
}

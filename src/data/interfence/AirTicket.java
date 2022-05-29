package data.interfence;
/**
 * This class holds ticket details.
 * @author  Pengtao Li
 * @version  1.0
 */
public class AirTicket {

	/**
	 * The Booking number of the airticket.
	 */
	private String BookID;
	/**
	 * The ID number of the passenger.
	 */
	private String ID;
	/**
	 * The name of the passenger.
	 */
	private String name;
	/**
	 * The phone of the passenger.
	 */
	private String phone;
	/**
	 * The flight no. of the plane.
	 */
	private String flightno;
	/**
	 * The departure time of the plane.
	 */
	private String begintime;
	/**
	 * The time of arrival of the plane.
	 */
	private String endtime;
	/**
	 * The departure point of the plane.
	 */
	private String beginplace;
	/**
	 * The destination of the plane.
	 */
	private String endplace;
	/**
	 * The seat number of the airticket.
	 */
	private String seat;
	/**
	 * The boarding gate of the airticket.
	 */
	private String boardinggate;
	/**
	 * Passengers' choice of food.
	 */
	private String food;
	/**
	 * The seat rank of the airticket.
	 */
	private int seatrank;
	/**
	 * Whether to carry luggage.
	 */
	private int carryluggage;
	/**
	 * Whether to check luggage.
	 */
	private int checkluggage;
	/**
	 * Whether to choose insurance.
	 */
	private int insurance;
	/**
	 * Whether to check in.
	 */
	private int checkin;
	/**
	 * The ID of check-in baggage.
	 */
	private String carryid;
	/**
	 * The default constructor of the AirTicket
	 */
	public AirTicket() {
	}

	/**
	 * The constructor of the AirTicket
	 * @param bookID The Booking number of the airticket.
	 * @param ID     The ID number of the passenger.
	 * @param name   The name of the passenger.
	 * @param phone  The phone of the passenger.
	 * @param flightno The flight no. of the plane.
	 * @param begintime The departure time of the plane.
	 * @param endtime   The time of arrival of the plane.
	 * @param beginplace   The departure point of the plane.
	 * @param endplace  The destination of the plane.
	 * @param seat      The seat number of the airticket.
	 * @param seatrank      The seat rank of the airticket.
	 * @param boardinggate The boarding gate of the plane.
	 * @param food          Passengers' choice of food.
	 * @param insurance     Whether to choose insurance.
	 * @param checkluggage   Whether to check luggage.
	 * @param carryluggage   Whether to carry luggage.
	 * @param carryid        The ID of check-in baggage.
	 * @param checkin       Whether to check in.
	 */
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
	/** SET BookID.
	 *
	 */
	public void setBookID(String bookID) {
		BookID = bookID;
	}
	/** SET ID.
	 *
	 */
	public void setID(String ID) {
		this.ID = ID;
	}
	/** SET name.
	 *
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** SET phone.
	 *
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/** SET flightno.
	 *
	 */
	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}
	/** SET begintime.
	 *
	 */
	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}
	/** SET endtime.
	 *
	 */
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	/** SET beginplace.
	 *
	 */
	public void setBeginplace(String beginplace) {
		this.beginplace = beginplace;
	}
	/** SET endplace.
	 *
	 */
	public void setEndplace(String endplace) {
		this.endplace = endplace;
	}
	/** SET boardinggate.
	 *
	 */
	public void setBoardinggate(String boardinggate) {
		this.boardinggate = boardinggate;
	}
	/** SET carryluggage.
	 *
	 */
	public void setCarryluggage(int carryluggage) {
		this.carryluggage = carryluggage;
	}
	/** SET checkluggage.
	 *
	 */
	public void setCheckluggage(int checkluggage) {
		this.checkluggage = checkluggage;
	}
	/** SET carryid.
	 *
	 */
	public void setCarryid(String carryid) {
		this.carryid = carryid;
	}

	/** GET BookID.
	 * @return BookID
	 */
	public String getBookID() {
		return BookID;
	}

	/** GET ID.
	 * @return ID
	 */
	public String getID() {
		return ID;
	}


	/**GET name.
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/** GET begintime.
	 * @return begintime
	 */
	public String getBegintime() {
		return begintime;
	}

	/** GET endtime.
	 * @return endtime
	 */
	public String getEndtime() {
		return endtime;
	}

	/** GET beginplace.
	 * @return beginplace
	 */
	public String getBeginplace() {
		return beginplace;
	}

	/** GET endplace.
	 * @return endplace
	 */
	public String getEndplace() {
		return endplace;
	}


	/** GET seat.
	 * @return seat
	 */
	public String getSeat() {
		return seat;
	}


	/** SET seat
	 * @param seat
	 */
	public void setSeat(String seat) {
		this.seat = seat;
	}


	/** GET Boardinggate.
	 * @return boardinggate
	 */
	public String getBoardinggate() {
		return boardinggate;
	}


	/** GET food.
	 * @return food
	 */
	public String getFood() {
		return food;
	}


	/** SET food
	 * @param food
	 */
	public void setFood(String food) {
		this.food = food;
	}


	/** GET seat rank
	 * @return seatrank
	 */
	public int getSeatrank() {
		return seatrank;
	}


	/** SET seat rank
	 * @param seatrank
	 */
	public void setSeatrank(int seatrank) {
		this.seatrank = seatrank;
	}


	/** SET insurance state
	 * @param insurance
	 */
	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}


	/** GET flightno
	 * @return flightno
	 */
	public String getFlightno() {
		return flightno;
	}


	/** GET phone
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}


	/** GET carryluggage
	 * @return carryluggage
	 */
	public int getCarryluggage() {
		return carryluggage;
	}


	/** GET checkluggage
	 * @return checkluggage
	 */
	public int getCheckluggage() {
		return checkluggage;
	}

	/** SET checkin state
	 * @param checkin
	 */
	public void setCheckin(int checkin) {
		this.checkin = checkin;
	}

	/** Get carryid
	 * @return carryid
	 */
	public String getCarryid() {
		return carryid;
	}

	/** GET detailed insurance information
	 * @return Detailed insurance information
	 */
	public String RealInsurance() {
		if (insurance == 0)
			return "No";
		else
			return "Yes";
	}



	/** GET detailed seating classes information
	 * @return Detailed seating classes information
	 */
	public String getRealSeatrank() {
		if (seatrank == 0)
			return "First Class";

		else
			return "Second Class";
	}

	/** GET check-in state.
	 * @return checkin
	 */
	public int getCheckin() {
		return checkin;
	}

	/** GET insurance state
	 * @return insurance
	 */
	public int getInsurance() {
		return insurance;
	}
}

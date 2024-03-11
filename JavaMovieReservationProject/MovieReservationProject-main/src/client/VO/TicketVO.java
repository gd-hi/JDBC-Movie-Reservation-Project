package client.VO;

import java.sql.Timestamp;

public class TicketVO {
	private String customerName; // �� �̸� -ticketingView 0
	private String customerId; // �� ���̵� -ticketingView 0
	private String seatNumber; // �¼� �̸� -seatView //A1,A2 .. �̷������� ��.
	private String theatherName; // ���� �̸� -ticketingView 0
	private String roomNumber; // �� ��ȣ -ticketingView 0
	private String movieName; // ��ȭ �̸� -ticketingView 0
	private String day; // ��ȭ ���� ��¥. �� �� �� -- > ������ ��¥�� ����. -ticketingView 0
	private int time; // ��ȭ ȸ�� -ticketingView 0
	private String reserveDate; // ������ ��¥ �� �ð� -seatView 0

	// �߰�
	private int cost; // Ƽ�� ���� -ticketingView 0
	private int person; // �ο� �� -ticketingView 0

	public TicketVO() {
		super();
	}

	public TicketVO(String customerName, String customerId, String seatNumber, String theatherName, String roomNumber,
			String movieName, String day, int time, String reserveDate, int cost, int person) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.seatNumber = seatNumber;
		this.theatherName = theatherName;
		this.roomNumber = roomNumber;
		this.movieName = movieName;
		this.day = day;
		this.time = time;
		this.reserveDate = reserveDate;
		this.cost = cost;
		this.person = person;
	}
	@Override
	public String toString() {
		String text =
				customerName+" " + customerId + " "+ seatNumber + " " + theatherName + " " +roomNumber+ " " +movieName
				+ " " + day
				+ " " +time
				+ " " + reserveDate
				+ " " +cost +" " + person;
		return text;
	}
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getTheatherName() {
		return theatherName;
	}

	public void setTheatherName(String theatherName) {
		this.theatherName = theatherName;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(String reserveDate) {
		this.reserveDate = reserveDate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

}

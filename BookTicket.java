package TicketBook;

public class BookTicket {
	private String movie_name;
	private int no_of_tickets;
	
	public BookTicket(String m,  int n) {
		this.movie_name = m;
		this.no_of_tickets = n;
	}
	
	
	public String getMovie_name() {
		return movie_name;
	}

	public int getNo_of_tickets() {
		return no_of_tickets;
	}
	public void setNo_of_tickets(int no_of_tickets) {
		this.no_of_tickets = no_of_tickets;
	}
	
	public void printTicketDetails() {
		System.out.println("========Ticket========");
		System.out.println("Movie Name: "+movie_name);
		System.out.println("Tickets Booked: "+no_of_tickets);	
	}
}

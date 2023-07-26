package TicketBook;

import java.util.Scanner;

public class BoxOffice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theatre theatre = new Theatre("PVR");
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1: Show Seat Availabilty. 2: Book Ticket. 3: To Check Ticket Details. 4: Cancel Ticket. 5: Exit");
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				int number_of_seats = theatre.getNo_of_seats();
				System.out.println(number_of_seats + " seats are available");
			}break;
			case 2: {
				System.out.println("Enter movie name: ");
				String name = sc.next();
				System.out.println("Enter No. of Seats: ");
				int num = sc.nextInt();
				theatre.setTicket(new BookTicket(name, num));
				int res = theatre.bookTicket();
				System.out.println("Successfully booked " + res + " tickets");
				
			}break;
			case 3: {
				System.out.println("Ticket Details");				
				BookTicket t = theatre.getTicket();
				System.out.println(t.getMovie_name());
				System.out.println(t.getNo_of_tickets());
				
			}break;
			case 4: {
				System.out.println("Enter No. of tickets to be canceled");
				int cancel = sc.nextInt();
				theatre.cancelTicket(cancel);
				
			}break;
			case 5: {
				System.out.println("Thank You, Your Ticket has been booked!!!");
				flag = false;
				
			}break;
			default: {
				System.out.println("Wrong Input");
			}break;
			}
		}

	}

}

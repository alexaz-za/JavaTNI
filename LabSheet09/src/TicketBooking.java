import javax.swing.*;
import java.util.concurrent.atomic.AtomicLong;

public class TicketBooking {
    static String select_showtime(Movie movie){
        int select = Integer.parseInt(JOptionPane.showInputDialog("Titanic (PG-13), 120 mins"+
                "\nPress 1 to select show time = 13:00" +
                "\nPress 2 to select show time = 14:30" +
                "\nPress 3 to select show time = 15:00" +
                "\nEnter a number:"));
        switch (select){
            case 1:
                return "13:00";
            case 2:
                return "14:30";
            case 3:
                return "15:00";
            default:
                return "Error time";
        }
    }
    static String select_seat_number(){
        String seat_row = JOptionPane.showInputDialog("Select seat row [A-G]:");
        int seat_number = Integer.parseInt(JOptionPane.showInputDialog("Select seat number [1-12]:"));
        return seat_row.toUpperCase() + seat_number;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Titanic",120,"PG-13");

        String show_time = select_showtime(movie);
        String seat_number = select_seat_number();
        Ticket ticket = new Ticket("T001",movie,show_time,seat_number,240);

        int confirm = JOptionPane.showConfirmDialog(null,"Do you want to book a " + movie.getTitle() + " ticket?","Book Ticket",JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, ticket.bookTicket());
        }

        JOptionPane.showMessageDialog(null,ticket);
    }
}

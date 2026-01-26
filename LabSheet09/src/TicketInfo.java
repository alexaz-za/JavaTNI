import javax.swing.*;

public class TicketInfo {
    static String select_showtime(Movie movie){
        int select = Integer.parseInt(JOptionPane.showInputDialog(null,"Titanic (PG-13), 120 mins"+
                "\nPress 1 to select show time = 13:00" +
                "\nPress 2 to select show time = 14:30" +
                "\nPress 3 to select show time = 15:00" +
                "\nEnter a number:","Input",JOptionPane.QUESTION_MESSAGE));
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
        String seat_row = JOptionPane.showInputDialog(null,"Select seat row [A-G]:","Input",JOptionPane.QUESTION_MESSAGE);
        int seat_number = Integer.parseInt(JOptionPane.showInputDialog(null,"Select seat number [1-12]:","Input",JOptionPane.QUESTION_MESSAGE));
        return seat_row.toUpperCase() + seat_number;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Titanic",120,"PG-13");

        String show_time = select_showtime(movie);
        String seat_number = select_seat_number();

        Ticket ticket = new Ticket("T001",movie,show_time,seat_number,240);
        JOptionPane.showMessageDialog(null,ticket);

    }
}
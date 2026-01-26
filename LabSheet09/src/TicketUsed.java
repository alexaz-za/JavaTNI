import javax.swing.*;

public class TicketUsed {
    public static String show_movie_list(Ticket... tickets){
        String list = "";
        for (Ticket ticket : tickets){
            list += ticket.getTicket_id() + ": " + ticket.getMovie() + "\n";
        }
        return list;
    }

    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[]{
                new Ticket("T001", new Movie("Titanic", 120,"PG-13"),"12:00", "B7", 280),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };
        int confirm = JOptionPane.showConfirmDialog(null,"Do you want to book or use a ticket?","Ticket",JOptionPane.YES_NO_OPTION);
        while (true){
            if (confirm != JOptionPane.YES_OPTION) break;
            String searchTicketId = JOptionPane.showInputDialog(show_movie_list(tickets) + "\nEnter a ticket id for booking:");
            Ticket select = null;
            for (Ticket ticket : tickets){
                if (ticket.getTicket_id().equalsIgnoreCase(searchTicketId)){
                    select = ticket;
                    break;
                }
            }
            if (select != null){
                String memu = JOptionPane.showInputDialog(select.getMovie().toString() +
                        "\n\nPress 1 to book a ticket" +
                        "\nPress 2 to use a ticket" +
                        "\nPress 3 to see a ticket status" +
                        "\n\nEnter a menu:");
                if (memu.equals("1")) JOptionPane.showMessageDialog(null,select.bookTicket() + "\n--------------------\n" + select.toString());
                else if (memu.equals("2")) JOptionPane.showMessageDialog(null,select.useTicket() + "\n--------------------\n" + select.toString());
                else if (memu.equals("3")) JOptionPane.showMessageDialog(null,select.toString());
            }
            confirm = JOptionPane.showConfirmDialog(null,"Do you want to book or use other tickets?","Ticket",JOptionPane.YES_NO_OPTION);
        }
    }
}
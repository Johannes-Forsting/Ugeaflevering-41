public class Ticket {
    private int price = 150;
    private Arrangement arrangement;
    private int TicketID;
    private Person TicketOwner;
    private boolean ticketOwned = false;


    public Ticket(Arrangement arrangement, int ticketID) {
        this.arrangement = arrangement;
        this.TicketID = ticketID;
    }

    public void assignTicket(Person person){
        this.TicketOwner = person;
        this.ticketOwned = true;
    }

    public String getTicketOwner(){
        return this.TicketOwner.getName();
    }

    @Override
    public String toString() {
        return  "{" +
                "TicketID=" + TicketID +
                ", TicketOwner=" + TicketOwner.getName() +
                ", arrangement=" + arrangement.getName() +
                ", price=" + price +
                '}';
    }
}

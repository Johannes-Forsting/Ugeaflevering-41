public class Ticket {
    private int price = 150;
    private Arrangement arrangement;
    private int ticketID;
    private Person ticketOwner;
    private boolean ticketOwned = false;

    //Constructor som tager imod et arrangement og et ticketID
    public Ticket(Arrangement arrangement, int ticketID) {
        this.arrangement = arrangement;
        this.ticketID = ticketID;
    }

    //Metode som assigner en ticket til en person. Før den bliver "solgt" har den ikke nogen ejermand og kan blive købt af alle.
    public void assignTicket(Person person){
        this.ticketOwner = person;
        this.ticketOwned = true;
    }

    @Override
    public String toString() {
        return  "{" +
                "TicketID=" + ticketID +
                ", TicketOwner=" + ticketOwner.getName() +
                ", arrangement=" + arrangement.getName() +
                ", price=" + price +
                '}';
    }
}

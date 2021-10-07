public class Person {
    private String name;
    private int amountOfTickets;
    private String creditCardInfo;

    public Person(String name, int amountOfTickets, String creditCardInfo) {
        this.name = name;
        this.amountOfTickets = amountOfTickets;
        this.creditCardInfo = creditCardInfo;

    }

    public int getAmountOfTickets(){
        return this.amountOfTickets;
    }

    public String getName(){
        return this.name;
    }



}

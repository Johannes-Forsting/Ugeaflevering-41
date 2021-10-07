import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Oprettelse af 3 band-kontrakter samt 3 bands
        String[] mindsOf99Kontrakt = {"Har 4 medlemmer", "Skal have 1 fadøl i timen pr. medlem", "SKal have mange moneter for koncert"};
        String[] suspektKontrakt = {"Skal have et omklædningsrum", "skal have 2 fadøl i timen pr. medlem", "Skal have endnu flere moneter end de andre"};
        String[] lukasGrahamKontrakt = {"Skal have en makeupartist", "Skal have 1 alkoholfri øl klar når han ankommer", "Gør det gratis"};
        Band mindsOf99 = new Band("Minds of 99", 25000, mindsOf99Kontrakt);
        Band suspekt = new Band("Suspekt", 45000, suspektKontrakt);
        Band lukasGraham = new Band("Lukas Graham", 0, lukasGrahamKontrakt);

        //Et array af bands samt et array af spilletidspunter som bruges til at oprette et arrangement
        Band[] bands = {mindsOf99, suspekt, lukasGraham};
        String[] spilleTidspunkter = {"15:30", "18:00", "21:00"};

        //Arrangement "Roskilde Festival" oprettes
        Arrangement roskildeFestival = new Arrangement("Roskilde Festival 2022", bands, spilleTidspunkter, "EgonOlsen@gmail.com", "Roskildevej 23");

        //Programmet udskrives ved en metode som bruger for loop til at køre band-navne, samt spilletidspunkter igennem.
        roskildeFestival.koncertStartTimes();

        //Opretter 100 tickets som ikke har nogen ejer endnu. Samt 100 personer (I tilfælde af hver person kun køber 1 billet.)
        int ticketsAndPersons = 100;
        Ticket[] tickets = new Ticket[ticketsAndPersons];
        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = new Ticket(roskildeFestival, (i + 1));
        }
        Person[] persons = new Person[ticketsAndPersons];

        //For loop som spørger om navn, antal billetter og købsinformationer indtil alle billetter er solgt
        int ticketsSold = 0;
        for (int i = 0; i < persons.length; i++) {
            String name = getName();
            int ticketsWanted = getAmountOfTickets(ticketsSold);
            String creditCardInfo = getCreditCardInfo();
            persons[i] = new Person(name, ticketsWanted, creditCardInfo);
            for (int j = 0; j < ticketsWanted; j++) {
                tickets[j + ticketsSold].assignTicket(persons[i]);
            }
            ticketsSold = ticketsSold + ticketsWanted;
            System.out.println("Tickets sold are now: " + ticketsSold);
            if (ticketsSold == 100){
                break;
            }
        }


        //Udgiver en liste for alle billetter og hvem som ejer dem.
        for (int i = 0; i < tickets.length; i++) {
            System.out.println(tickets[i].toString());
        }


        System.out.println("All tickets are now sold. Goodbye!");


    }

    public static String getName(){
        System.out.println("What is your name");
        String name = scanner.nextLine();
        return name;
    }

    public static int getAmountOfTickets(int ticketsAllreadySold){
        int ticketAmount = 0;
        while (true) {
            try {
                System.out.println("How many tickets would you like to buy. There are " + (100 - ticketsAllreadySold) + " tickets available");
                ticketAmount = scanner.nextInt();
                if (ticketAmount > 0 && ticketAmount <= 100 - ticketsAllreadySold) {
                    break;
                } else {
                    throw new Exception();
                }
            }
            catch (Exception e){
                scanner.nextLine();
                System.out.println("There is only " + (100 - ticketsAllreadySold) + " tickets available. Please enter a number between 1 and " + (100 - ticketsAllreadySold));
            }
        }
        return ticketAmount;
    }

    public static String getCreditCardInfo(){
        scanner.nextLine();
        String info = "";
        System.out.println("Please insert your credit card number here. It is a 8 digit code on the back of your credit card.");
        boolean containsOtherThanDigits = true;
        while (containsOtherThanDigits){
            containsOtherThanDigits = false;
            info = scanner.nextLine();
            if (info.length() == 8){
                for (int i = 0; i < info.length(); i++) {
                    char x = info.charAt(i);
                    if (!Character.isDigit(x)){
                        System.out.println("Please only type digits.");
                        containsOtherThanDigits = true;
                        break;
                    }
                }
            }
            else{
                System.out.println("The given number is not 8 digits. try again.");
                containsOtherThanDigits = true;
            }
        }
        return info;
    }
}

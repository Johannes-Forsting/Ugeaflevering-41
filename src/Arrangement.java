public class Arrangement {
    private String name;
    private Band[] bands;
    private String[] playingTimes;
    private String kontaktPersonEmail;
    private String adresse;
    private Ticket[] tickets;

    public Arrangement(String name, Band[] bands, String[] playingTimes, String kontaktPersonEmail, String adresse, Ticket[] tickets) {
        this.name = name;
        this.bands = bands;
        this.playingTimes = playingTimes;
        this.kontaktPersonEmail = kontaktPersonEmail;
        this.adresse = adresse;
        this.tickets = tickets;
    }

    public String getName(){
        return this.name;
    }


    public void koncertStartTimes(){
        for (int i = 0; i < this.bands.length; i++){
            System.out.println(bands[i].getName() + " spiller kl. " + this.playingTimes[i]);
        }
    }
}

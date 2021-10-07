public class Arrangement {
    private String name;
    private Band[] bands;
    private String[] playingTimes;
    private String kontaktPersonEmail;
    private String adresse;

    public Arrangement(String name, Band[] bands, String[] playingTimes, String kontaktPersonEmail, String adresse) {
        this.name = name;
        this.bands = bands;
        this.playingTimes = playingTimes;
        this.kontaktPersonEmail = kontaktPersonEmail;
        this.adresse = adresse;
    }


    public String getName(){
        return this.name;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public String getKontaktPersonEmail(){
        return this.kontaktPersonEmail;
    }





    public void koncertStartTimes(){
        for (int i = 0; i < this.bands.length; i++){
            System.out.println(bands[i].getName() + " spiller kl. " + this.playingTimes[i]);
        }
    }


}

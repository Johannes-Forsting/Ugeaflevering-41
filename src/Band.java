import java.util.Arrays;

public class Band {
    private String name;
    private int price;
    private String[] kontract;

    public Band(String name, int price, String[] kontract) {
        this.name = name;
        this.price = price;
        this.kontract = kontract;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }



    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

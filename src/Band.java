import java.util.Arrays;

public class Band {
    private String name;
    private int price;
    private String[] contract;

    public Band(String name, int price, String[] kontract) {
        this.name = name;
        this.price = price;
        this.contract = kontract;
    }

    public String getName(){
        return this.name;
    }




    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

package challenges.Zadanie_9_4_B.Abstract;

public abstract class Shop {
    protected String companyName;
    protected String commodity;//towar
    protected int quantityOfCommodity; //Ilość towaru
    protected double price;


    public Shop(String companyName, String commodity, int quantityOfCommodity, double price) {
        this.companyName = companyName;
        this.commodity = commodity;
        this.quantityOfCommodity = quantityOfCommodity;
        this.price = price;
    }

    public abstract void process();
}

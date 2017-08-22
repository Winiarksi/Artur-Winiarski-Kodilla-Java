package challenges.Zadanie_9_4_B.Abstract;

public abstract class Shop {
    private String companyName;
    private String commodity;//towar
    private int quantityOfCommodity; //Ilość towaru
    private double price;

    public Shop(String companyName, String commodity, int quantityOfCommodity, double price) {
        this.companyName = companyName;
        this.commodity = commodity;
        this.quantityOfCommodity = quantityOfCommodity;
        this.price = price;
    }

    protected abstract void process();

    @Override
    public int hashCode() {
        int result = companyName.hashCode();
        result = 31 * result + commodity.hashCode();
        return result;
    }

    public String getCompanyName() {
        return companyName;
    }
}

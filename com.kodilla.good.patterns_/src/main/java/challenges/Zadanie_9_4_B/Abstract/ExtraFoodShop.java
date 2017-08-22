package challenges.Zadanie_9_4_B.Abstract;

public class ExtraFoodShop extends Shop{
    private String companyName;
    private String commodity;//towar
    private int quantityOfCommodity; //Ilość towaru
    private double price;

    public ExtraFoodShop(String companyName, String commodity, int quantityOfCommodity, double price) {
        super(companyName, commodity, quantityOfCommodity, price);
    }

    protected void process() {
        System.out.println("Nie wiem, a raczej nie rozumiem, co ma zawierać ta metoda process");
        System.out.println(" " + companyName + " " + commodity + " " + quantityOfCommodity + ".");
    }

    public void discountCode(){
        if(quantityOfCommodity > 100) { price *= 0.85; }
    }

    public String getCompanyName() {
        return companyName;
    }
}

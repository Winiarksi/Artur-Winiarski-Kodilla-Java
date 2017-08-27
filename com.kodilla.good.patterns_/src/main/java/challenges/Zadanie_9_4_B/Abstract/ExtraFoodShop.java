package challenges.Zadanie_9_4_B.Abstract;

public class ExtraFoodShop extends Shop{

    public ExtraFoodShop(String companyName, String commodity, int quantityOfCommodity, double price) {
        super(companyName, commodity, quantityOfCommodity, price);
    }

    public void process() {
        System.out.println("#####################");
        discountCode();
        System.out.print("W firmie " + companyName + " zakupiono towar " + commodity + " w ilości " + quantityOfCommodity + " sztuk ");
        System.out.print("za cenę jednostkową: ");
        System.out.printf("%.2f", price);
        System.out.println(" zł.");
    }

    public void discountCode(){

        if(quantityOfCommodity > 100) {
            price *= 0.85;
            System.out.println("Zamówienie przekroczyło sto sztók towaru.");
            System.out.println("Uzyskany rabat 25% wartości towaru.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExtraFoodShop that = (ExtraFoodShop) o;

        if (quantityOfCommodity != that.quantityOfCommodity) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (!companyName.equals(that.companyName)) return false;
        return commodity.equals(that.commodity);
    }

    @Override
    public int hashCode() {
        int result = companyName.hashCode();
        result = 31 * result + commodity.hashCode();
        return result;
    }
}

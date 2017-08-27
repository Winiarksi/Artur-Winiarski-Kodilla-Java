package challenges.Zadanie_9_4_B.Abstract;


public class HealthyShop extends Shop {

    public HealthyShop(String companyName, String commodity, int quantityOfCommodity, double price) {
        super(companyName, commodity, quantityOfCommodity, price);
    }

    public void process() {
        System.out.println("#####################");
        System.out.print("W firmie " + companyName + " zakupiono towar " + commodity + " w ilości " + quantityOfCommodity + " sztuk ");
        System.out.print("za cenę jednostkową: ");
        System.out.printf("%.2f", price);
        System.out.println(" zł.");
        sendEmailToManufacturer();
    }

    public void sendEmailToManufacturer() {
        System.out.print("@ od HealthyShop do Producenta: \nZamówienie na " + commodity + ", w ilości ");
        System.out.printf("%.0f", (quantityOfCommodity * 1.5));
        System.out.println( " sztuk.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HealthyShop that = (HealthyShop) o;

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


package challenges.Zadanie_9_4_B.Abstract;

import java.util.Random;

public class GlutenFreeShop extends Shop {

    public GlutenFreeShop(String companyName, String commodity, int quantityOfCommodity, double price) {
        super(companyName, commodity, quantityOfCommodity, price);
    }

    public void process() {
        System.out.println("#####################");
        unexpectedSituation();
    }

    public void unexpectedSituation(){

        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(companyName + ": NIEOCZEKIWANY BRAK TOWARU !");
            System.out.println("Transakcja anulowana.");
            quantityOfCommodity = 0;
            price = 0;
        } else {
            System.out.print("W firmie " + companyName + " zakupiono towar " + commodity + " w ilości " + quantityOfCommodity + " sztuk ");
            System.out.print("za cenę jednostkową: ");
            System.out.printf("%.2f", price);
            System.out.println(" zł.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlutenFreeShop that = (GlutenFreeShop) o;

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

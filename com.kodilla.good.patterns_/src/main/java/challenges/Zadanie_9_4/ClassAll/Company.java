package challenges.Zadanie_9_4.ClassAll;

public class Company {
    String companyName;
    String commodity;
    int quantityOfCommodity;

    public Company(String companyName, String commodity, int quantityOfCommodity) {
        this.companyName = companyName;
        this.commodity = commodity;
        this.quantityOfCommodity = quantityOfCommodity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCommodity() {
        return commodity;
    }

    public int getQuantityOfCommodity() {
        return quantityOfCommodity;
    }

    @Override
    public String toString() {
        return "Company:" +
                "companyName='" + companyName + '\'' +
                ", commodity='" + commodity + '\'' +
                ", quantityOfCommodity=" + quantityOfCommodity +
                '.';
    }
}

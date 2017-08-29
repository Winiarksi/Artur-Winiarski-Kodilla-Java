package challenges.Zadanie_9_5_B;

public class Connection {
    private String cityFrom;
    private String cityTo;

    public Connection(String cityFrom, String cityTo) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Connection that = (Connection) o;

        if (!cityFrom.equals(that.cityFrom)) return false;
        return cityTo.equals(that.cityTo);
    }

    @Override
    public int hashCode() {
        int result = cityFrom.hashCode();
        result = 31 * result + cityTo.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return cityFrom + " " + cityTo + ", ";
    }
}

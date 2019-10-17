import java.util.Objects;

public class City {
    private String name;
    private String state;
    private int zipcode;

    public City() {
    }

    public City(String name, String state, int zipcode) {
        this.name = name;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return zipcode == city.zipcode &&
                name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, zipcode);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}

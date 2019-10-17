import java.util.Objects;

public class City {
    private String name;
    private String state;
    private String ZipCode;

    City(){

    }

    public City(String name, String state, String zipCode) {
        this.name = name;
        this.state = state;
        ZipCode = zipCode;
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

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return name.equals(city.name) &&
                state.equals(city.state) &&
                ZipCode.equals(city.ZipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, state, ZipCode);
    }

    @Override
    public String toString() {
        return "\nCity{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", ZipCode='" + ZipCode + '\'' +
                '}';
    }
}

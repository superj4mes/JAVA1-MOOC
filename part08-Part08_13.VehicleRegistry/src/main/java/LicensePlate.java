
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object o) {
        // Check if the object references the same location in memory
        if (this == o) return true;

        // Check if the object is not an instance of LicensePlate
        if (!(o instanceof LicensePlate)) return false;

        // Cast the object to LicensePlate
        LicensePlate that = (LicensePlate) o;

        // Check if the liNumber and country of both LicensePlate objects are equal
        return Objects.equals(liNumber, that.liNumber) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        // Calculate the hash code using the liNumber and country fields
        return Objects.hash(liNumber, country);
    }
}


import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    // HashMap to store the registry with LicensePlate as keys and owner as values
    private HashMap<LicensePlate, String> registry;

    // Constructor initializes the registry HashMap
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    // Method to add a new vehicle to the registry
    // Returns true if successful, false if the license plate already exists
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.containsKey(licensePlate)) {
            return false;
        } else {
            this.registry.put(licensePlate, owner);
            return true;
        }
    }

    // Method to retrieve the owner of a vehicle by its license plate
    // Returns the owner if found, null otherwise
    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }

    // Method to remove a vehicle from the registry by its license plate
    // Returns true if the vehicle was removed, false otherwise
    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    // Method to print all license plates in the registry
    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.registry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    // Method to print all unique owners in the registry
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        // Iterate through the registry values and add unique owners to the list
        for (String owner : this.registry.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }

        // Print each unique owner
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}

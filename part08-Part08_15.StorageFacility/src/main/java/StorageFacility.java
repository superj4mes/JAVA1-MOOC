
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    // HashMap to store storage units with their contents
    private HashMap<String, ArrayList<String>> storageFacility;

    // Constructor initializes the storageFacility HashMap
    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    // Method to add an item to a storage unit
    public void add(String unit, String item) {
        // If the storage unit does not exist, create a new ArrayList for it
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());
        // Add the item to the ArrayList associated with the storage unit
        this.storageFacility.get(unit).add(item);
    }

    // Method to retrieve contents of a given storage unit
    public ArrayList<String> contents(String storageUnit) {
        // Get the ArrayList of items for the storage unit
        ArrayList<String> items = this.storageFacility.get(storageUnit);
        // If no items found, return an empty ArrayList
        if (items == null) {
            return new ArrayList<>();
        } else {
            return items;
        }
    }

    // Method to remove an item from a storage unit
    public void remove(String storageUnit, String item) {
        // Remove the item from the ArrayList associated with the storage unit
        this.storageFacility.get(storageUnit).remove(item);
        // If the ArrayList is empty after removal, remove the storage unit from the HashMap
        if (this.storageFacility.get(storageUnit).size() == 0) {
            this.storageFacility.remove(storageUnit);
        }
    }

    // Method to retrieve a list of all storage units
    public ArrayList<String> storageUnits() {
        ArrayList<String> storage = new ArrayList<>();
        // Iterate through the keys (storage units) in the HashMap and add them to the list
        for (String unit : this.storageFacility.keySet()) {
            storage.add(unit);
        }
        return storage;
    }
}

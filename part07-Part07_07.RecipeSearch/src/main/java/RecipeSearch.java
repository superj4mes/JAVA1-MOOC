import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the file name containing recipes
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        // Read recipes from the file
        ArrayList<Recipe> recipes = readRecipesFromFile(fileName);

        // Print available commands to the user
        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        // Command-line interface loop
        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                listRecipes(recipes);
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchTerm = scanner.nextLine();
                findRecipesByName(recipes, searchTerm);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = scanner.nextInt();
                findRecipesByCookingTime(recipes, maxCookingTime);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                findRecipesByIngredient(recipes, ingredient);
            } else if (command.equals("stop")) {
                break;
            } else {
                System.out.println("Unknown command!");
            }
        }

        scanner.close();
    }

    // Method to read recipes from the file
    private static ArrayList<Recipe> readRecipesFromFile(String fileName) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            // Read each recipe from the file
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int cookingTime = Integer.parseInt(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                String line;
                // Read ingredients until an empty line is encountered
                while (fileScanner.hasNextLine() && !(line = fileScanner.nextLine()).isEmpty()) {
                    ingredients.add(line);
                }
                // Create and add a Recipe object to the recipes list
                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        return recipes;
    }

    // Method to list recipes
    private static void listRecipes(ArrayList<Recipe> recipes) {
        System.out.println("\nRecipes:");
        // Print each recipe in the list
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    // Method to find recipes by name
    private static void findRecipesByName(ArrayList<Recipe> recipes, String searchTerm) {
        System.out.println("\nRecipes:");
        boolean found = false;
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(recipe);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No recipes found matching the search term.");
        }
    }
    
    // Method to find recipes by cooking time
    private static void findRecipesByCookingTime(ArrayList<Recipe> recipes, int maxCookingTime) {
        System.out.println("\nRecipes:");
        boolean found = false;
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No recipes found within the specified cooking time.");
        }
    }
    
    // Method to find recipes by ingredient
    private static void findRecipesByIngredient(ArrayList<Recipe> recipes, String ingredient) {
        System.out.println("\nRecipes:");
        boolean found = false;
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No recipes found containing the specified ingredient.");
        }
    }
}

// Recipe class to represent each recipe
class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    // Constructor to initialize a Recipe object
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    // Getter methods for accessing recipe attributes
    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    // Method to represent a recipe as a string
    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
}

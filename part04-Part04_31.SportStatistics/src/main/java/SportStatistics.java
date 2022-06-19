
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        
        int totalGames = 0, wins = 0, losses = 0;
        
        // create list of game objects from reading statistics file
        ArrayList<Statistics> games = readRecordsFromFile(file);
        
        // prompt user for team
        System.out.println("Team: ");
        String team = scan.nextLine();
  
        // find how many games prompted team has played
        for (Statistics game : games) {
            if (game.getHomeTeam().equalsIgnoreCase(team) || game.getAwayTeam().equalsIgnoreCase(team)) {
                totalGames++;
                
                // check wins & losses of prompted team
                // first check if prompted is home team
                if (game.getHomeTeam().equalsIgnoreCase(team)) {
                    if (game.getHomeScore() > game.getAwayScore()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                // if not home team check if away team
                if (game.getAwayTeam().equalsIgnoreCase(team)) {
                    if (game.getHomeScore() < game.getAwayScore()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }    
            } 
        }
        
        // print statistics
        System.out.println("Games: " + totalGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }
    
    public static ArrayList<Statistics> readRecordsFromFile(String file) {
        ArrayList<Statistics> games = new ArrayList<>();
 
        try {
            Scanner reader = new Scanner(Paths.get(file));    
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] array = line.split(",");
                String homeTeam = array[0];
                String awayTeam = array[1];
                int homeScore = Integer.valueOf(array[2]);
                int awayScore = Integer.valueOf(array[3]);
                games.add(new Statistics(homeTeam, awayTeam, homeScore, awayScore));
            }   
        } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                }
        return games;
    }

}

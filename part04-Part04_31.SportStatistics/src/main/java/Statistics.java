/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JESSE
 */
public class Statistics {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    
    public Statistics(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getAwayTeam() {
        return this.awayTeam;
    }
    
    public int getHomeScore() {
        return this.homeScore;
    }
    
    public int getAwayScore() {
        return this.awayScore;
    }
    
    @Override
    public String toString() {
        return this.homeTeam + " " + this.awayTeam + " " + this.homeScore + " " + this.awayScore;
    }
    
}

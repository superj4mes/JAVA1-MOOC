import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int passingSum = 0;
        int passingCount = 0;
        int[] gradeDistribution = new int[6]; // Index 0 is for grade 0, index 1 is for grade 1, and so on...
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("-1")) {
                break;
            }
            
            int point = Integer.valueOf(input);
            
            if (point >= 0 && point <= 100) {
                sum += point;
                count++;
                if (point >= 50) {
                    passingSum += point;
                    passingCount++;
                }
                int grade = calculateGrade(point);
                gradeDistribution[grade]++;
            }
        }
        
        // Check least one valid point was entered
        if (count > 0) {
            double average = (double) sum / count;
            double passingAverage = passingCount > 0 ? (double) passingSum / passingCount : 0.0;
            double passPercentage = (double) passingCount / count * 100;
            
            System.out.println("Point average (all): " + average);
            System.out.println("Point average (passing): " + (passingCount > 0 ? passingAverage : "-"));
            System.out.println("Pass percentage: " + passPercentage);
            System.out.println("Grade distribution:");
            for (int i = 5; i >= 0; i--) {
                String stars = "*".repeat(gradeDistribution[i]);
                System.out.println(i + ": " + stars);
            }
        } else {
            System.out.println("No valid points entered.");
        }
        
        scanner.close();
    }
    
    private static int calculateGrade(int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else {
            return 5;
        }
    }
}

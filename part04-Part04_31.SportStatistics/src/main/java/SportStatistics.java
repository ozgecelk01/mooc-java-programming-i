
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String fileName = scan.nextLine();

        ArrayList<Game> games = readFromFile(fileName);
        System.out.println("Team: ");
        String team = scan.nextLine();

        ArrayList<Game> gamesOfATeam = new ArrayList<>();
        for (Game game : games) {
            if (team.equals(game.getHomeTeam()) || team.equals(game.getVisitingTeam())) {
                gamesOfATeam.add(game);
            }
        }

        System.out.println("Games: " + gamesOfATeam.size());

        int wins = 0;
        for (Game game : gamesOfATeam) {
            if (game.isWinner(team)) {
                wins++;
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesOfATeam.size() - wins));

    }

    public static ArrayList<Game> readFromFile(String fileName) {
        ArrayList<Game> games = new ArrayList<>();

        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];

                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Failed to read from file.");
        }

        return games;

    }

}

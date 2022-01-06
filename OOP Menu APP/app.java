import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
    static Scanner scanner = new Scanner(System.in);
    static List<team> teams = new ArrayList<team>();
public static void main(String[] args) {
    int decision = 0;

        while (true){
            printOptions();
        decision = scanner.nextInt();
        if (decision == 1){
            teams.add(createNewTeam());
        } else if (decision == 2){
            addPlayerToTeam();
         } else if (decision == 3){
             removePlayerFromTeam();
         } else if (decision == 4){
             describeTeam();
         } else {
             System.out.println("Please Choose A Valid Option");
         }
        }

    }
    private static void printOptions() {
        System.out.println("1.) Create New Team");
        System.out.println("2.) Add Player To Team");
        System.out.println("3.) Remove Player From Team");
        System.out.println("4.) Show Team Info");
    }
    private static void describeTeam(){
        printTeamNames();
        System.out.print("Which team would you like to see the info for? ");
        String teamName = scanner.next();
        try {
            team foundTeam = findTeamByName(teamName);
            foundTeam.describe();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
    private static team createNewTeam(){
        System.out.print("Enter name of the team you want to create: ");
        String name = scanner.next();
        return new team(name);
    }
    private static void addPlayerToTeam() {
        printTeamNames();
        System.out.println("Enter the name of the team you wish to add a player to: ");
        String teamName = scanner.next();
        try {
            team foundTeam = findTeamByName(teamName);
            foundTeam.addPlayer(createNewPlayer());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    private static Player createNewPlayer(){
        System.out.print("Enter player name: ");
        String name = scanner.next();
        System.out.print("Enter player position: ");
        String position = scanner.next();
        System.out.print("Enter player specialty: ");
        String specialty = scanner.next();
        return  new Player(name, position, specialty);
    }

    private static Player Player(String name, String position, String specialty) {
        return null;
    }
    private static void printTeamNames() {
        for(team Team : teams){
            System.out.println(Team.getName());
        }
    }
    private static team findTeamByName(String name) throws Exception{
        for(team Team : teams){
            if (Team.getName().equals(name)){
                return Team;
            }
        }
        throw new Exception("Team not found: " + name);
    }
    private static void removePlayerFromTeam(){
        printTeamNames();
        System.out.println("Enter the name of the team you wish to remove a player from: ");
        String teamName = scanner.next();
        try {
            team foundTeam = findTeamByName(teamName);
            foundTeam.describe();
            System.out.println("Which player would you like to remove? ");
            String playerName = scanner.next();
            foundTeam.removePlayer(playerName);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}

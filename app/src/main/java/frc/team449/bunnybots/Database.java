package frc.team449.bunnybots;

/*
 * PowerUpDatabase is a class that stores all data being collected.
 *
 * Used for preventing data loss between page flips and for submission.
 *
 * Created by Nate on 10/10/2017.
 */

public class Database {                         // game will change each year

    // All data being collected
    public String scoutName;
    public int matchNumber;
    public int teamNumber;
    public boolean noShow;
    public int preloadBunny;
    public boolean noAuto;
    public boolean movedForward;
    public int autoBalls;
    public boolean achievedNothing;
    public int dead;
    // the rest of the values for the game go here

    // Default entries
    public Database() {
        scoutName = "";
        matchNumber = 0;
        teamNumber = 0;
        noShow = false;
        noAuto = false;
        movedForward = false;
        autoBalls = 0;
        preloadBunny = 0;
        achievedNothing = false;
        dead = 0;
        // the rest of the values for the game go here
    }

    public String toString() {
        // each instance variable separated by a comma
        return "";
    }

    public static String checkData() {
        String errors = "";
        // check for errors
        if (MainActivity.db.scoutName.equals("")) {
            errors += "Scout name cannot be empty\n";
        }
        if (MainActivity.db.matchNumber == 0) {
            errors += "Please select a match number\n";
        }
        if (MainActivity.db.teamNumber == 0) {
            errors += "Please select a team number\n";
        }
        if (MainActivity.db.preloadBunny == 0) {
            errors += "Please select an option for preloaded bunny\n";
        }
        if (MainActivity.db.dead == 0) {
            errors += "Please select an option for deadness\n";
        }
        return errors;
    }
}

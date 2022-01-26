package ArraysOfObjects;

public class Player {
    private String name;
    private int jerseyNumber;

    public Player(String nameln, int numln) {
        name = nameln;
        jerseyNumber = numln;
    }

    /**
     * @return a player string
     */
    public String toString() { // toString method
        return String.format("%s has the jersey number %s.", name, jerseyNumber);
    }

    /**
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * @return the jersey number of the player
     */
    public int getJerseyNumber() {
        return jerseyNumber;
    }
}

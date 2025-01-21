public class ArcadeGame {
    String gameName;
    int numberOfTokens;
    boolean isMultiplayer;


    public ArcadeGame(String paramgameName, int paramnumberOfTokens, boolean paramisMultiplayer){
        gameName = paramgameName;
        numberOfTokens = paramnumberOfTokens;
        isMultiplayer = paramisMultiplayer;
    }

    public void printInfo(){
        System.out.println("Welcome to " + gameName + ". It is " + isMultiplayer + " that your game is multiplayer. This game costs " + numberOfTokens + " tokens.");
    }
}

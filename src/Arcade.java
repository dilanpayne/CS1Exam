public class Arcade {
    String name;
    boolean isOpen;
    int yearFounded;


    public static void main(String[] args) {
        Arcade pixelParadise = new Arcade();

    }

    public Arcade(){
        System.out.println("Hello World! Good luck on your exams!");

        name = "Pixel Paradise";
        isOpen = true;
        yearFounded = 1985;

        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We were founded in " + yearFounded + ".");

        yearFounded = 2008;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We were founded in " + yearFounded + ".");

        spinForTokens();
        gameOfTheDay("Mario");
        displayScores();
        ticketMultiplier();

        ArcadeGame classicGame;
        classicGame = new ArcadeGame("Pinball", 2, false);
        classicGame.printInfo();

        ArcadeGame myFavGame;
        myFavGame = new ArcadeGame("Mario", 3, true);
        myFavGame.printInfo();

    }

    public void spinForTokens(){
        int randomInt = (int)((Math.random()*50) + 1);
        System.out.println("You spun the wheel and you won " + randomInt + " tokens!");
    }

    public void gameOfTheDay(String gameName){
        System.out.println("Today's game of the day is " + gameName + ".");
    }

    public void displayScores(){
        for (int x = 1; x <=5; x = x + 1){
            System.out.println(x);
        }

        for (int x = 200; x <= 1100; x = x + 300){
            System.out.println(x);
        }

        for (int x = 6; x >=0; x = x - 1){
            System.out.print(x + ", ");
        }
    }

    public void ticketMultiplier(){
        double randomNum = Math.random();
        if (randomNum < 0.25){
            System.out.println("You've won 10 extra tickets.");
        }

        if (randomNum >= 0.25 && randomNum < 0.5){
            System.out.println("You've won 50 extra tickets.");
        }

        if (randomNum >= 0.5 && randomNum < 0.75){
            System.out.println("You've doubled your tickets.");
        }

        if (randomNum >= 0.75 && randomNum < 1){ // the final 1 is unnecessary
            System.out.println("You've tripled your tickets.");
        }
    }
}
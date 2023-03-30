import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating 5 NSFs
       NSF wrestlingNSF = new NSF("Wrestling", "America");
       NSF basketballNSF = new NSF("Basketball","Romania");
       NSF footballNSF = new NSF("Football", "North Korea");
       NSF soccerNSF = new NSF("Soccer", "Brazil");
       NSF tennisNSF = new NSF("Tennis", "Canada");
       // Creating 15 Players
        Player player1 = new Player("Jim", "Johnson");
        Player player2 = new Player("Jack", "Jones");
        Player player3 = new Player("Kenneth", "Diorite");
        Player player4 = new Player("King", "Queen");
        Player player5 = new Player("Marigold", "Sunshine");
        Player player6 = new Player("Mister", "Twister");
        Player player7 = new Player("Blaze", "Combustible");
        Player player8 = new Player("Bob", "Sanchez");
        Player player9 = new Player("Apollo", "Moonlight");
        Player player10 = new Player("Dog", "Cat");
        Player player11 = new Player("Fluffy", "O'Neil");
        Player player12 = new Player("Winston", "Dawson");
        Player player13 = new Player("Jonathan", "Joestar");
        Player player14 = new Player("Zenith", "Ultra");
        Player player15 = new Player("Cool", "Guy");
        // Adding players to NSFs
        wrestlingNSF.addPlayer(player1);
        wrestlingNSF.addPlayer(player2);
        wrestlingNSF.addPlayer(player3);
        basketballNSF.addPlayer(player4);
        basketballNSF.addPlayer(player5);
        basketballNSF.addPlayer(player6);
        footballNSF.addPlayer(player7);
        footballNSF.addPlayer(player8);
        footballNSF.addPlayer(player9);
        soccerNSF.addPlayer(player10);
        soccerNSF.addPlayer(player11);
        soccerNSF.addPlayer(player12);
        tennisNSF.addPlayer(player13);
        tennisNSF.addPlayer(player14);
        tennisNSF.addPlayer(player15);
        // Take 3 players and add at least 2 NSFs to each of them
        player1.addNSF(wrestlingNSF);
        player1.addNSF(basketballNSF);
        player2.addNSF(basketballNSF);
        player2.addNSF(footballNSF);
        player3.addNSF(footballNSF);
        player3.addNSF(tennisNSF);
        player3.addNSF(tennisNSF);
        // Create 2 ISFs
        ISF isf1 = new ISF("ISF1"); // Contains 3 NSFs (Wrestling, Basketball, Football)
        ISF isf2 = new ISF("ISF2"); // Contains the 2 remaining NSFs (Soccer, Tennis)
        // Adding NSFs to ISFs
        isf1.addNSF(wrestlingNSF);
        isf1.addNSF(basketballNSF);
        isf1.addNSF(footballNSF);
        isf2.addNSF(soccerNSF);
        isf2.addNSF(tennisNSF);
        // Create IOC
        IOC ioc = new IOC("IOC");
        ArrayList<ISF> list = new ArrayList<ISF>();
        list.add(isf1);
        list.add(isf2);
        ioc.setISFs(list);
        // Display players for NSFs
        wrestlingNSF.listNSFPlayers();
        basketballNSF.listNSFPlayers();
        footballNSF.listNSFPlayers();
        soccerNSF.listNSFPlayers();
        tennisNSF.listNSFPlayers();
        // Display NSFs for 2 players
        player1.listPlayerNSFs();
        player2.listPlayerNSFs();
        player3.listPlayerNSFs();
        // Display total # of players registered w/ NSFs in each ISF, & in the IOC
        System.out.println("ISF1 Number of Players: " + isf1.countPlayersInNSFs());
        System.out.println("ISF2 Number of Players: " + isf2.countPlayersInNSFs());
        System.out.println("IOC Number of Players: " + ioc.countPlayersInISFNSFs());
        // Display total # of NSFs in each ISF and in IOC
        System.out.println("ISF1 Number of NSFs: " + isf1.countNSFs());
        System.out.println("ISF2 Number of NSFs: " + isf2.countNSFs());
        System.out.println("IOC Number of NSFs: " + ioc.countNSFs());
    }
}


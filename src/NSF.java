
import java.util.ArrayList;
public class NSF {
    protected ArrayList<Player> players;
    protected String sport, country;

    public NSF(String sport, String country){
        this.sport = sport;
        this.country = country;
        this.players = new ArrayList<Player>();
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        for (int i = 0; i < this.players.size(); i++){
            this.players.get(i).getNSFs().remove(this);
        }
        this.players = players;
        for (int i = 0; i < players.size(); i++) {
            this.addPlayer(players.get(i));
        }
    }

    public String toString(){
        return country + " " + sport;
    }

    public void listNSFPlayers(){
        String returnString = this.toString() + ": ";
        for (int i = 0; i < players.size()-1; i++) {
            returnString += players.get(i).toString() + ", ";
        }
        returnString += players.get(players.size()-1);
        System.out.println(returnString);
    }

    public void addPlayer(Player player){
        if (!players.contains(player)){
            players.add(player);
        }
        if (!player.getNSFs().contains(this)){
            player.addNSF(this);
        }
    }
}

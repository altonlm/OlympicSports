import java.util.ArrayList;
public class IOC {
    private String name;
    private ArrayList<ISF> ISFs;

    IOC(String name){
        this.name = name;
        this.ISFs = new ArrayList<ISF>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISF> getISFs() {
        return ISFs;
    }

    public void setISFs(ArrayList<ISF> ISFs) {
        this.ISFs = ISFs;
    }
    int countNSFs() {
        int count = 0;
        for (ISF isf : ISFs){
            count += isf.countNSFs();
        }
        return count;
    }

    int countPlayersInISFNSFs() {
        int count = 0;
        for (ISF isf : ISFs){
            count += isf.countPlayersInNSFs();
        }
        return count;
    }
}

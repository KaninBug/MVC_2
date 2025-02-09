import java.util.ArrayList;

public class DataSet {
    private ArrayList<PetInformation> informationsList = new ArrayList<>();
    private ArrayList<PetInformation> phoenixList = new ArrayList<>();
    private ArrayList<PetInformation> dragonList = new ArrayList<>();
    private ArrayList<PetInformation> owlList = new ArrayList<>();

    public void setList(String i, PetType t, String d, int v, boolean fr) {
        phoenixList.add(new PetInformation(i, t, d, v), fr);
    }

    public ArrayList<PetInformation> getList() {
        
    }
}

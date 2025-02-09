import java.util.ArrayList;

public class PetInformation {
    private DataSet data = new DataSet();
    private String petID;
    private PetType type;
    private String dateCheckHelth;
    private int vaccin;

    public PetInformation(String i, PetType t, String d, int v) {
        petID = i;
        type = t;
        dateCheckHelth = d;
        vaccin = v;
    }

    private void checkType(PetType t) {
        // Phoenix
        if(t == PetType.Phoenix) {
            boolean fireResistance = false;
            if(fireResistance == false) {
                
            }
        }

        // Dragon
        else if(t == PetType.Dragon) {
            int pollution = 0;
            if(pollution > 70) {
                
            }
        }

        // Owl
        else if(t == PetType.Owl) {
            int distanceWithoutFood = 0;
            if(distanceWithoutFood < 100) {
                
            }
        }
    }

    private void putInList() {
        
    }
}

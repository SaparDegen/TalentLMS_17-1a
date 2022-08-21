import java.util.Arrays;

public class Farm {
    private String ownerName;
    private String address;
    private Sheep[] sheeps;
    private Cow[] cows;
    private Horse[] horses;


    public Farm(String ownerName, String address){
        this.ownerName = ownerName;
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "ownerName='" + ownerName + '\'' +
                ", address='" + address + '\'' +
                ", sheeps=" + Arrays.toString(sheeps) +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                '}';
    }
}

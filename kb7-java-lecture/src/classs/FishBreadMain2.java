package classs;

public class FishBreadMain2 {
    public static void main(String[] args) throws Exception {
        FishBread fish1 = new FishBread("팥", "잉어", 888);
        fish1.printFishBread();

        FishBread fish2 = new FishBread();
        fish2.printFishBread();
    }
}

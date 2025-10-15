package Task_4;

public class MainClass {
    public static void main(String[] args) {


        Factory fabric1 = new Factory("Zolotova", "brick", 1967, "Building", 1000);
        Factory fabric2 = new Factory("Grodnova", "brick", 1999, "Roofs", 1000);
        Factory fabric3 = new Factory("Glataya", "brick", 1989, "Roofs", 1100);

        System.out.println(fabric2.info());

        Village village = new Village();
        village.addBuilding(fabric1);
        village.addBuilding(fabric2);
        village.addBuilding(fabric3);
        village.info();
    }

}

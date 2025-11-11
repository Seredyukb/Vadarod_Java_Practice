package Task_4;

public class CivilBuilding extends Building {
    private String buildingPurpose = "";
    private int floorsCount;

    public CivilBuilding(String street, String wallMaterial, int constructionYear, String buildingPurpose, int floorsCount) {
        super(street, wallMaterial, constructionYear);
        this.buildingPurpose = buildingPurpose;
        this.floorsCount = floorsCount;
    }
}

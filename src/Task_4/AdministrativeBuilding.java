package Task_4;

public class AdministrativeBuilding extends CivilBuilding {
    private String purpose = "";
    private int residentsCount;

    public AdministrativeBuilding(String street, String wallMaterial, int constructionYear, String buildingPurpose, int floorsCount, String purpose, int residentsCount) {
        super(street, wallMaterial, constructionYear, buildingPurpose, floorsCount);
        this.purpose = purpose;
        this.residentsCount = residentsCount;
    }
}

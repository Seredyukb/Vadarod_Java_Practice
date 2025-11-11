package Task_4;

public class ApartmentBuilding extends CivilBuilding {
    private int apartmentCount;

    public ApartmentBuilding(String street, String wallMaterial, int constructionYear, String buildingPurpose, int floorsCount, int apartmentCount) {
        super(street, wallMaterial, constructionYear, buildingPurpose, floorsCount);
        this.apartmentCount = apartmentCount;
    }
}

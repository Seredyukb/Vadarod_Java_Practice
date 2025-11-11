package Task_4;

public class Building {
    private String street = "";
    private String wallMaterial = "";
    private int constructionYear;

    public Building(String street, String wallMaterial, int constructionYear) {
        this.street = street;
        this.wallMaterial = wallMaterial;
        this.constructionYear = constructionYear;
    }

    public String info() {
        String result = "street=" + street + " " +
                "wallMaterial=" + wallMaterial + " " +
                "constructionYear=" + constructionYear;
        return result;
    }

}

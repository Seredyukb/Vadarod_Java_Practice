package Task_4;

public class IndustrialBuilding extends Building {
    private String industry = "";

    public IndustrialBuilding(String street, String wallMaterial, int constructionYear, String industry) {
        super(street, wallMaterial, constructionYear);
        this.industry = industry;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String info() {
        String result = "industry=" + industry + " " +
                super.info();
        return result;
    }
}

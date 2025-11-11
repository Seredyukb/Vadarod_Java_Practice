package Task_4;

public class Factory extends IndustrialBuilding {

    private int employeesCount;
    private String products = "";

    public Factory(String street, String wallMaterial, int constructionYear, String industry, int employeesCount) {
        super(street, wallMaterial, constructionYear, industry);
        this.employeesCount = employeesCount;

    }

    public String info() {
        String result = "employeesCount=" + employeesCount + " " +
                "products=" + products + " " +
                super.info();

        return result;
    }
}

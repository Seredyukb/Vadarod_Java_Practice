package Task_5_Interfaces;

public class VacuumCleaner implements ElectroTools {
    //            6. Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn. Класс Пылесос имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».
    private String name = "";
    private String brand = "";
    private int price;
    private Boolean isOn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    public VacuumCleaner(String name, String brand, int price, Boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Пылесос убирает");
    }
}

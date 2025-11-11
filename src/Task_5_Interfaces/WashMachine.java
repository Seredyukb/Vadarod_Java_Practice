package Task_5_Interfaces;

public class WashMachine implements KitchenTools {
    //            5. Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn. Класс стиральная машина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».
    private String name = "";
    private String brand = "";
    private int price;
    private Boolean isOn;

    public WashMachine(Boolean isOn, int price, String brand, String name) {
        this.isOn = isOn;
        this.price = price;
        this.brand = brand;
        this.name = name;
    }

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

    @Override
    public void work() {
        System.out.println("Стиральная машина стирает");
    }
}

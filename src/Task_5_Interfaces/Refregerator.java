package Task_5_Interfaces;

public class Refregerator implements KitchenTools {
    //            4. Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен). Класс холодильник имплементирует интерфейс Электроприборы. Переопределите метод work так, чтобы методы выводил «Холодильник морозит».
    private String name = "";
    private String model = "";

    public Refregerator(String name, String model, int price, Boolean isOn) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.isOn = isOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    private int price;
    private Boolean isOn;

    @Override
    public void work() {
        System.out.println("Холодильник морозит");
    }
}

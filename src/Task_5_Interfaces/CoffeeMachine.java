package Task_5_Interfaces;

public class CoffeeMachine implements ElectroTools {
    //            3. Создать класс Кофемашина. Поля наименование. Список функционала. Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».
    private String name = "";
    private String functionList = "";
    private int price;
    private Boolean isOn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunctionList() {
        return functionList;
    }

    public void setFunctionList(String functionList) {
        this.functionList = functionList;
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

    public CoffeeMachine(String name, String functionList, int price, Boolean isOn) {
        this.name = name;
        this.functionList = functionList;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Кофемашина варит кофе");
    }

    @Override
    public void start() {
        isOn = true;
        ElectroTools.super.start();
    }

    // Метод для демонстрации способностей кофемашин (пункт 10)
    public static void demonstrateCoffeeMachines(CoffeeMachine[] coffeeMachines) {
        System.out.println("На выставке представлено " + coffeeMachines.length + " кофемашин:\n");

        for (int i = 0; i < coffeeMachines.length; i++) {
            CoffeeMachine machine = coffeeMachines[i];
            System.out.println((i + 1) + ". " + machine.getName());
            System.out.println("   Состояние: " + (machine.getOn() ? "ВКЛЮЧЕНА" : "ВЫКЛЮЧЕНА"));

            // Включаем кофемашину
            machine.start();

            // Демонстрируем работу
            machine.work();

            System.out.println();
        }
    }
}

package Task_5_Interfaces;

public class Main {
    //    Электроприборы
//    7. В классе main cоздайте по паре объектов на основании вышесозданных классов. Создайте в классе main создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора

    //9.  В классе main сделать выставку только из Кухонной техники. Продемонстрировать спосбоности всех электроприборов в этой выставке.
//10. В классе main сделать выставку кофемашин. Продемонстрировать способности всех кофе машин.
//11. На любой кофемашине вызовете метод start(). После этого переопределите метод start так, чтобы этот метод включал прибор (менял значение Boolean isOn на true.) Выведите результат в консоль
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("Кофемашина", "Приготовление кофе", 20, true);
        Refregerator refregerator1 = new Refregerator("Minsk", "Minsk 1000", 100, true);
        VacuumCleaner vacuumCleaner1 = new VacuumCleaner("Пылесос", "Bosch", 250, true);
        WashMachine washMachine1 = new WashMachine(true, 300, "Siemens", "Стиралка");
        System.out.println("Выставка из электроприбров и демонстрация способностей каждого электроприбора");
        ElectroTools exhibitionTools[] = {refregerator1, vacuumCleaner1, washMachine1};
        for (ElectroTools s : exhibitionTools) {
            s.work();
        }
        System.out.println("Выставка кухонной техники и демонстрация способностей каждого электроприбора");
        KitchenTools kitchenToolsExhibition[] = {refregerator1, washMachine1};
        for (KitchenTools s : kitchenToolsExhibition) {
            s.work();
        }

        CoffeeMachine delonghi = new CoffeeMachine(
                "DeLonghi Magnifica",
                "эспрессо, капучино, латте, двойной кофе",
                299,
                false
        );

        CoffeeMachine philips = new CoffeeMachine(
                "Philips LatteGo",
                "автоматическая чистка молока в резервуаре",
                249,
                false
        );

        CoffeeMachine bosch = new CoffeeMachine(
                "Bosch VeroCafe",
                "быстрый нагрев, энергосбережение, таймер",
                180,
                false
        );
        CoffeeMachine coffeeExhibition[] = {delonghi, philips, bosch};

        CoffeeMachine.demonstrateCoffeeMachines(coffeeExhibition);
        bosch.start();
        System.out.println(bosch.getOn());
    }
}

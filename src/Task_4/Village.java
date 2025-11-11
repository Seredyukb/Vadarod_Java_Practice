package Task_4;

public class Village {
    private Building buildings[] = new Building[1];

    public void addBuilding(Building building) {
        // Создаем новый массив на 1 элемент больше
        Building[] newBuildingArray = new Building[buildings.length + 1];

        // Копируем все существующие элементы
        for (int i = 0; i < buildings.length; i++) {
            newBuildingArray[i] = buildings[i];
        }

        // Добавляем новый элемент в конец
        newBuildingArray[newBuildingArray.length - 1] = building;

        // Заменяем старый массив новым
        buildings = newBuildingArray;
    }

    public void info() {
        for (Building building : buildings) {
            if (building != null) {
                System.out.println(building.info());
            }
        }
    }
}

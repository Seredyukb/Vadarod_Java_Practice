package Task_19;

public class Car {
    private String id;
    private String mark;
    private int distance;
    private int year;
    private int maxSpeed;
    private int price;

    public Car(String id, String mark, int distance, int year, int maxSpeed, int price) {
        this.id = id;
        this.mark = mark;
        this.distance = distance;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", mark='" + mark + '\'' +
                ", distance=" + distance +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}

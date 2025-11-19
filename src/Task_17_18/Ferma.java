package Task_17_18;

import java.io.Serializable;

public class Ferma implements Serializable {
    private String name;
    private int pigCount;

    @Override
    public String toString() {
        return "Ferma{" +
                "name='" + name + '\'' +
                ", pigCount=" + pigCount +
                '}';
    }

    public Ferma(String name, int pigCount) {
        this.name = name;
        this.pigCount = pigCount;
    }
}

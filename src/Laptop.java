import java.util.Scanner;

public class Laptop {
    int ram;
    int mem;
    String os;
    String color;

    public String toString() {
        return "ноубук на " + os + ", " + color + " цвета, с " + ram + " гб ОЗУ и жестким диском на " + mem + "Тб" + "\n";
    }
}

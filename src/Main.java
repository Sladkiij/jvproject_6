import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.os = "win";
        laptop1.color = "black";
        laptop1.ram = 2048;
        laptop1.mem = 1;

        Laptop laptop2 = new Laptop();
        laptop2.os = "lin";
        laptop2.color = "white";
        laptop2.ram = 1024;
        laptop2.mem = 2;

        Laptop laptop3 = new Laptop();
        laptop3.os = "win";
        laptop3.color = "black";
        laptop3.ram = 2048;
        laptop3.mem = 1;

        Laptop laptop4 = new Laptop();
        laptop4.os = "win";
        laptop4.color = "black";
        laptop4.ram = 2048;
        laptop4.mem = 2;

        Laptop laptop5 = new Laptop();
        laptop5.os = "lin";
        laptop5.color = "white";
        laptop5.ram = 1024;
        laptop5.mem = 2;

        Laptop laptop6 = new Laptop();
        laptop6.os = "lin";
        laptop6.color = "black";
        laptop6.ram = 1024;
        laptop6.mem = 2;

        Laptop laptop7 = new Laptop();
        laptop7.os = "win";
        laptop7.color = "white";
        laptop7.ram = 2048;
        laptop7.mem = 2;

        Laptop laptop8 = new Laptop();
        laptop8.os = "win";
        laptop8.color = "black";
        laptop8.ram = 1024;
        laptop8.mem = 1;

        Laptop laptop9 = new Laptop();
        laptop9.os = "win";
        laptop9.color = "black";
        laptop9.ram = 1024;
        laptop9.mem = 1;

        Laptop laptop10 = new Laptop();
        laptop10.os = "win";
        laptop10.color = "black";
        laptop10.ram = 1024;
        laptop10.mem = 1;

        Map<Integer, Laptop> laptops = new HashMap<Integer, Laptop>();
        laptops.put(1, laptop1);
        laptops.put(2, laptop2);
        laptops.put(3, laptop3);
        laptops.put(4, laptop4);
        laptops.put(5, laptop5);
        laptops.put(6, laptop6);
        laptops.put(7, laptop7);
        laptops.put(8, laptop8);
        laptops.put(9, laptop9);
        laptops.put(10, laptop10);

        //Каталог

        System.out.println(laptops);

        System.out.println("Каталог");

        //ввод

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите критерий из представленных");
        System.out.println("1 - ram");
        System.out.println("2 - mem");
        System.out.println("3 - os");
        System.out.println("4 - color");
        int number = sc.nextInt();

        System.out.println("Выбранный параметр " + number);

        if(number == 1)
        {
            Scanner sc1 = new Scanner(System.in);

            System.out.println("Введите минимальное кол-во ОЗУ 1024 или 2048 (Вводить целое число)");

            int b = sc1.nextInt();

            System.out.println("Выбранный параметр " + b);

            if (b == 1024) {
            for (int i = 1; i <= 10; i++) {
                if ((laptops.get(i)).ram == 1024) {
                    System.out.println(laptops.get(i));
                }
            }
        }   else{
            for (int i = 1; i <= 10; i++) {
                if ((laptops.get(i)).ram == 2048) {
                    System.out.println(laptops.get(i));
                }
            }
        }

        }
        else if (number == 2)
        {
            Scanner sc2 = new Scanner(System.in);

            System.out.println("Введите минимальное кол-во памяти 1 или 2 Тб (Вводить целое число)");

            int b = sc2.nextInt();

            System.out.println("Выбранный параметр " + b);

            if (b == 1) {
            for (int i = 1; i <= 10; i++) {
                if ((laptops.get(i)).mem == 1) {
                    System.out.println(laptops.get(i));
                }
            }
        } else{
            for (int i = 1; i <= 10; i++) {
                if ((laptops.get(i)).mem == 2) {
                    System.out.println(laptops.get(i));
                }
            }
        }

        }
        else if (number == 3)
        {
            Scanner sc3 = new Scanner(System.in);

            System.out.println("Введите необходимую ОС 1 - win или 2 - lin (Ввести 1 или 2)");

            Integer b = sc3.nextInt();

            System.out.println("Выбранный параметр " + b);

            if (b == 1) {
            for (int i = 1; i <= 10; i++) {
                if ((laptops.get(i)).os == "win") {
                    System.out.println(laptops.get(i));
                }
            }
        } else{
            for (int i = 1; i <= 10; i++) {
                if ((laptops.get(i)).os == "lin") {
                    System.out.println(laptops.get(i));
                }
            }
        }

        }
        else
        {
            Scanner sc4 = new Scanner(System.in);

            System.out.println("Введите необходимый цвет 1 - black или 2 - white (Ввести 1 или 2)");

            Integer b = sc4.nextInt();

            System.out.println("Выбранный параметр " + b);

            if (b == 1) {
                for (int i = 1; i <= 10; i++) {
                    if ((laptops.get(i)).color == "black") {
                        System.out.println(laptops.get(i));
                    }
                }
            } else{
                for (int i = 1; i <= 10; i++) {
                    if ((laptops.get(i)).color == "white") {
                        System.out.println(laptops.get(i));
                    }
                }
            }
        }
    }
}
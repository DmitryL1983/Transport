import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 2015, "Россия", "Желтый",110, "Автомат", 1.7F);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 3.0F);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "Черный", 3.0F);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "Крсный", 1.7F);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый", 1.6F);
        System.out.println(granta);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        Bus bus1 = new Bus("ПАЗ", "3205", 1989, "Россия", "Белый", 60);
        Bus bus2 = new Bus("ЛиАЗ", "677", 1963, "Россия", "Желтый", 50);
        Bus bus3 = new Bus("ЛиАЗ", "5292", 2004, "Россия", "Синий", 80);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}
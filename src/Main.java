import Transport.Car;
public class Main {
    public static void main(String[] args) {
        Person maksim = new Person("Maksim", 35, "Minsk", "бренд - менеджер");
        Person any = new Person("Anya", 29, "Moscow", "методист образовательных программ");
        Person kate = new Person("Kate", 28, "Kaliningrad", "продакт - менеджер");
        Person artem = new Person("Artem", 27, "Moscow", "директор по развитию бизнеса");
        maksim.printGreeting();
        any.printGreeting();
        kate.printGreeting();
        artem.printGreeting();
        Person vladimir = new Person("Vladimir", 21, "Kazan", "");
        vladimir.printGreeting();
        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59,0 );
        System.out.println(rose);
        Car lada = new Car("Lada", "Granta", 1.7, "", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        lada.printCar();
        audi.printCar();
        bmw.printCar();
        kia.printCar();
        hyundai.printCar();
    }
}
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
    }
}
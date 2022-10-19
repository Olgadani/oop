public class Person {
    int birth;
    String name;
    String town;
    String job;

    Person(String name, int birth, String town, String job) {
        this.birth = birth;
        this.name = name;
        this.town = town;
        this.job = job;
    }

    public int getBirth() {
        return birth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getJob() {
        return job;
    }

    void printGreeting() {
        System.out.println("Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился в " + (2022 - getBirth()) + " году. Я работаю на должности " + getJob() + ". Будем знакомы!");

    }
}


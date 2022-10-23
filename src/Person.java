public class Person {
    int birth;
    String name;
    String town;
    String job;

    Person(String name, int birth, String town, String job) {
        if (birth < 0) {
            birth = 0;
        } else {
            this.birth = birth;
        }
        if (name == "") {
            System.out.println("Информация не указана");
        } else {
            this.name = name;
        }
        if (town == "") {
            System.out.println("Информация не указана");
        } else {
            this.town = town;
        }
        if (job == "") {
            System.out.println("Информация не указана");
        } else {
            this.job = job;
        }

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


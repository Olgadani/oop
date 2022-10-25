public class Person {
    private int birth;
    private String name;
    private String town;
    private String job;

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

    public void setBirth(int birth) {
        if (birth < 0) {
            birth = 0;
        } else {
            this.birth = birth;
        }
    }

    public void setName() {
        this.name = returnDefault(name, "Информация не указана");
    }

    public void setTown(String town) {
        this.town = returnDefault(town, "Информация не указана");
    }

    public void setJob(String job) {
        this.job = returnDefault(job, "Информация не указана");
    }

    private String returnDefault(String value, String error) {
        if (value == null || value.isBlank() || value.isEmpty()) {
          return error;
        } else {
            return value;
        }


    }

    void printGreeting() {
        System.out.println("Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился в " + (2022 - getBirth()) + " году. Я работаю на должности " + getJob() + ". Будем знакомы!");

    }


}


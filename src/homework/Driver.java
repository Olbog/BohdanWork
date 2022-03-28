package homework;

public class Driver {
    private String gender;
    private String name;
    private int age;

    public Driver(String gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws AgeException {
        if (age < 18) {
            throw new AgeException("You're too young for this transport");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package streamsAndlambdas;

public class Student {
    private int id;
    private String name;
    private int age;
    private int marks;
    public Student(int id, String name, int age, int marks)
    {
        this.age = age;
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString()
    {
        return this.name + " " + this.age + " " + this.marks + " " + this.id;
    }
}

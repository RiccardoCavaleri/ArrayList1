//creo una classe Student dichiarando il file con 'name' e 'age'
public class Student {
    private String name;
    private Integer age;
    //creo costruttore che inizializza 'name' e 'age'
    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    //creo getter e setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    //faccio override to string
    @Override
    public String toString() {
        return "Student{" +
                "name= " + name  +
                ", age= " + age +
                '}';
    }
}

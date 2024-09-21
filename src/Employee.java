
public class Employee {
    public int id;
    public String name;
    public int age;
    public double salary;
    public String position;
    public boolean isDeleted;

    public Employee(int id,String name, int age, double salary, String position, boolean isDeleted){
        this.id=id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
        this.isDeleted = isDeleted;
    }
}

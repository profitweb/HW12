import java.awt.event.PaintEvent;

public class Persson {
    private String name;
    private  String profession;
    private String workPlace;
    private int age;
    private int salary;

    public Persson(){

    }

    public Persson(String name, String profession, String workPlace, int age, int salary) {
        this.name = name;
        this.profession = profession;
        this.workPlace = workPlace;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getWorkPlace(){
        return workPlace;
    }
    public int getAge() {
        return age;
    }

    public int getSalary(){
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class Student{
    private String name;
    public Student(String n){
        name = n;
    }
    public Student(){
        name = "Manaswi";
    }
    public void printName(){
        System.out.println(name);
    }
}
class Cu1{
    public static void main(String[] args){
        Student a = new Student("085");
        Student b = new Student();
        a.printName();
        b.printName();
    }
}

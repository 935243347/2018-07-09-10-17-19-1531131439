package practice04;

public class Student extends Person{
    protected int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public String introduce(){
        return super.basicIntroduce() + " I am a Student. I am at Class " + this.klass + ".";
    }

    public int getKlass() {
        return klass;
    }
}

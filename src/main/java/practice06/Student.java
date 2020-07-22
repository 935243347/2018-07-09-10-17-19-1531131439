package practice06;

import practice04.Person;

public class Student extends Person {
    protected int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + this.klass + ".";
    }

    public int getKlass() {
        return klass;
    }
}

package practice07;

import practice07.Person;

public class Student extends Person {
    protected Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + this.klass.getNumber() + ".";
    }

    public Klass getKlass() {
        return klass;
    }
}

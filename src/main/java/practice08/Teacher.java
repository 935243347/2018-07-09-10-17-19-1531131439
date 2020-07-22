package practice08;

public class Teacher extends Person{
    protected Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = null;
    }
    public String introduce(){
        if(this.klass == null){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach Class " + this.klass.getNumber() + ".";
        }

    }
    public String introduceWith(Student student){
        if(student.klass.getNumber() == this.klass.getNumber()){
            return super.introduce() + " I am a Teacher. I teach " + student.name+ ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.name+ ".";
        }
    }

    public Klass getKlass() {
        return klass;
    }
}

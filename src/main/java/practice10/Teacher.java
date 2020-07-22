package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = null;
    }
    public String introduce(){
        if(this.classes == null){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            String tmpString = super.introduce() + " I am a Teacher. I teach Class ";
            for(int i = 0; i < classes.size(); i++){
                if(i == 0){
                    tmpString += classes.get(i).getNumber();
                } else {
                    tmpString = tmpString + ", " + classes.get(i).getNumber();
                }
            }
            tmpString += ".";
            return  tmpString;
        }

    }
    public String introduceWith(Student student){
        for(int i = 0; i < classes.size(); i++){
            if(student.getKlass().getNumber() == this.classes.get(i).getNumber()){
                return super.introduce() + " I am a Teacher. I teach " + student.name+ ".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.name+ ".";
    }
    public boolean isTeaching(Student student){
        for(int i = 0; i < classes.size(); i++){
            if(student.getKlass().getNumber() == this.classes.get(i).getNumber()){
                return true;
            }
        }
        return false;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }
}
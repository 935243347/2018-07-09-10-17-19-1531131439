package practice11;

import java.util.LinkedList;

public class Klass {
    private int number;
    private Student leader;
    private LinkedList<Teacher> teachers = new LinkedList<Teacher>();

    public Klass() {
        this.number = 0;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

    public void assignLeader(Student student){
        if(student.getKlass().number == this.number){
            this.leader = student;
            for(int i = 0; i < teachers.size(); i++){
                LinkedList<Klass> classesList = teachers.get(i).getClasses();
                for(int j = 0; j < classesList.size(); j++){
                    if(classesList.get(j).getNumber() == student.getKlass().getNumber()){
                        System.out.print("I am " + teachers.get(i).name + ". I know " + student.name + " become Leader of Class " + this.number + ".\n");
                    }
                }
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        student.setKlass(this);
        for(int i = 0; i < teachers.size(); i++){
            LinkedList<Klass> classesList = teachers.get(i).getClasses();
            for(int j = 0; j < classesList.size(); j++){
                if(classesList.get(j).getNumber() == student.getKlass().getNumber()){
                    System.out.print("I am " + teachers.get(i).name + ". I know " + student.name + " has joined Class " + this.number + ".\n");
                }
            }
        }
    }

    public boolean isIn(Student student){
        if(student.getKlass().number == this.number){
            return true;
        } else {
            return false;
        }
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
}
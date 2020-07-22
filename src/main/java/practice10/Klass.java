package practice10;

public class Klass {
    private int number;
    private Student leader;

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
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public boolean isIn(Student student){
        if(student.getKlass().number == this.number){
            return true;
        } else {
            return false;
        }
    }

    public void appendMember(Student student){
        student.setKlass(this);
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }
}
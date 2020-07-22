package practice07;

public class Klass {
    private int number;

    public Klass() {
        this.number = 0;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }
}

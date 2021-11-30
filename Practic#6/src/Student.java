public class Student {
    private String name = "student";
    private int ID;
    private double score;

    public Student( String name, int ID, double score) {
        this.name = name;
        this.ID = ID;
        this.score = score;
    }
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
    public Student(String name) {
        this.name = name;
    }

    public void PrintName(){
        System.out.print(name);
    }

    public void PrintID(){
        System.out.print(ID);
    }

    public void PrintScore(){
        System.out.print(score);
    }

    public String GetName(){
        return name;
    }

    public int GetID(){
        return ID;
    }

    public double GetScore(){
        return score;
    }

    public void SetID(int ID){
        this.ID = ID;
    }

    public void SetName(String name){
        this.name = name;
    }

    public void SetScore(double score){
        this.score = score;
    }

    public int compareTo(Student that) {
        if (that == null)
            throw new NullPointerException();
        if (this.score == that.score)
            return 0;
        if (this.score < that.score)
            return -1;
        return 1;
    }
}

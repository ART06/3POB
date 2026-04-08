public class Prisoner_Student_7_4 {
    public String name;
    public double height;
    public int sentence;
    
    public Prisoner_Student_7_4(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
    
    public Prisoner_Student_7_4() {
        this(null, 0.0, 0); 
        System.out.println("Novo prisioneiro vazio criado via encadeamento.");
    }
    
    public void display() {
        System.out.println("Nome: " + this.name);
        System.out.println("Altura: " + this.height + "m");
        System.out.println("Sentença: " + this.sentence + " anos");
    }

    public void display(boolean shouldThink) {
        display();
        if (shouldThink) {
            think();
        }
    }
    
    public void think() {
        System.out.println(this.name + " diz: I'll have my revenge.");
    }
}
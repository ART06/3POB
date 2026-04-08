public class Prisoner_Student_7_3 {
    public String name;
    public double height;
    public int sentence;

    public Prisoner_Student_7_3(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        
        System.out.println("Objeto instanciado para: " + this.name);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Novo nome definido: " + this.name);
    }

    public void think() {
        // Opcional: você pode usar this.name aqui também para clareza
        System.out.println(this.name + " está pensando em um plano.");
    }
}
public class Prisoner_Student_7_5 {
    private String name;
    private double height;
    private int sentence;
    private Cell cell;

    public Prisoner_Student_7_5(String name, double height, int sentence, Cell cell) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getSentence() {
        return sentence;
    }

    public Cell getCell() {
        return cell;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public void display() {
        System.out.println("Prisioneiro: " + this.name);
        System.out.println("Altura: " + this.height + "m");
        System.out.println("Sentença: " + this.sentence + " anos");
        System.out.println("Localização: Cela " + cell.getName());
        System.out.println("--------------------------");
    }
}
public class Cell {
    public String name;
    public boolean isOpen;
    private int securityCode;

    public Cell(String name, boolean isOpen, int securityCode) {
        this.name = name;
        this.isOpen = isOpen;
        this.securityCode = securityCode;
    }

    public String getName() {
        return name;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(int code) {
        if (code != this.securityCode) {
            System.out.println("ALERTA: Código de segurança incorreto!");
        } else {
            if (this.isOpen) {
                this.isOpen = false;
                System.out.println("Código correto. Fechando a porta da cela " + name + ".");
            } else {
                this.isOpen = true;
                System.out.println("Código correto. Abrindo a porta da cela " + name + ".");
            }
        }
        System.out.println("Status atual da cela " + name + ": " + (isOpen ? "ABERTA" : "FECHADA"));
    }
}
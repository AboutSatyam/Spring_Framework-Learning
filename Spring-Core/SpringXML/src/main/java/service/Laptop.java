package service;

class Processor {
    void start() {
        System.out.println("Processor is Started ");
    }
}

public class Laptop {
    private Processor process;


    public Laptop(Processor process) {
        this.process = process;
        System.out.println("Laptop Con");
    }

    public static void main(String[] args) {
        Processor proc = new Processor();
        Laptop lap = new Laptop(proc);
        lap.show();
    }

    public boolean show() {
        process.start();
        return false;
    }

}

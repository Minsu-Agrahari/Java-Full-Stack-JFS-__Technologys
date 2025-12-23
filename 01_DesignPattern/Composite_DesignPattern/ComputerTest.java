public class ComputerTest {
    public static void main(String[] args) {
        Component hd = new leaf(1000, "HDD");
        Component mouse = new leaf(400, "Mouse");
        Component moniter = new leaf(10_000, "Moniter");
        Component ram = new leaf(5_000, "RAM");
        Component cpu = new leaf(12_000, "CPU");
    
        Composite ph = new Composite("Perifer");
        Composite cabine = new Composite("Cabine");
        Composite mb = new Composite("Mother-Board");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(moniter);
        
        cabine.addComponent(hd);
        cabine.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabine);   
    
        ram.showPrice();
        computer.showPrice();
        cabine.showPrice();
    }
}

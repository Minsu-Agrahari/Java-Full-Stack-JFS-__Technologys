package DesignPattern.Builder_DesignPattern;

public class phoneBuilder {
    
    private String OS;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public phoneBuilder setOS(String oS) {
        OS = oS;
        return this;
    }
    public phoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }
    public phoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    public phoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    public phoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(OS, ram, processor, screenSize, battery);
    }
}

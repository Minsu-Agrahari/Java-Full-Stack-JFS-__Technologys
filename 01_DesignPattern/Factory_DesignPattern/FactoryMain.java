package DesignPattern.Factory_DesignPattern;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystem_Factory OSF = new OperatingSystem_Factory();

        Os obj = OSF.getInstance("Windows");
        obj.spec();
    }
}

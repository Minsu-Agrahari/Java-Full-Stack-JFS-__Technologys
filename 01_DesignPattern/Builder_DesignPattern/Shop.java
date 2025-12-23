package DesignPattern.Builder_DesignPattern;

public class Shop {
    public static void main(String[] args) {
        Phone ph = new phoneBuilder().setOS("Android")
                                            .setRam(2)
                                            .setScreenSize(12.4)
                                            .getPhone();

        System.out.println("Phone Details :- " + ph);
    }
}

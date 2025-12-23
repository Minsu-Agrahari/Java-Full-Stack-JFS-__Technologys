package DesignPattern.ProtoType_DesignPattern;

public class demo {
    public static void main(String[] args) throws CloneNotSupportedException{

        BookShop bs = new BookShop();
        bs.setShopName("myBookStore");
        bs.localData();
        
        // Shallow Copy
        // BookShop bs1 = (BookShop)bs.clone();
        // bs1.setShopName("A1");
        // bs1.localData();
        // System.out.println(bs1);
        
        // Deep Copy
        BookShop bs1 = bs.clone();
        bs1.setShopName("A1");
        bs1.localData();
        
        bs.getBook().remove(2); // removing the 2 book from the database
        
        System.out.println(bs + "\n");
        System.out.println(bs1);
    }
}
